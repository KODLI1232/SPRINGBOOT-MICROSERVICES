package Com.self.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import Com.self.SpringBoot.Dtos.StudentLoginDto;
import Com.self.SpringBoot.Entity.StudentEntity;
import Com.self.SpringBoot.Repository.StudentRepository;
import Com.self.SpringBoot.Request.ChangePasswordRequest;
import Com.self.SpringBoot.Request.StudentRequest;
import Com.self.SpringBoot.Security.JWTUtilClass;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class Studentservice {
    
    @Autowired
    StudentRepository studentRepository;
    
    @Autowired
    @Qualifier("passwordEncoder")
    private PasswordEncoder passwordEncoder;  //  NEW: BCrypt
    
    @Autowired
    private JWTUtilClass jWTUtilClass;  //  NEW: JWT Generation

    // SECURE SIGNUP (BCrypt + JWT)
    public String signupStudent(StudentRequest studentRequest) {
        if (studentRepository.existsByEmailId(studentRequest.getEmailId())) {
            return "Student already exists";
        }

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setFullName(studentRequest.getFullName());
        studentEntity.setEmailId(studentRequest.getEmailId());
        studentEntity.setMobileNumber(studentRequest.getMobileNumber());
        studentEntity.setBranch(studentRequest.getBranch());
        studentEntity.setCgpa(studentRequest.getCgpa());
        studentEntity.setYearOFPassing(studentRequest.getYearOFPassing());
        
        // HASH PASSWORD
        studentEntity.setPassword(passwordEncoder.encode(studentRequest.getPassword()));
        studentEntity.setRole("STUDENT");  //  Add role
        
        studentRepository.save(studentEntity);
        return "Student account created successfully";
    }

    //   SECURE LOGIN (BCrypt + JWT)
    public String signinStudent(StudentLoginDto studentLoginDto) {
        StudentEntity studentEntity = studentRepository.findByEmailId(studentLoginDto.getEmailId())
                .orElseThrow(() -> new RuntimeException("Invalid Email"));

        //  BCrypt PASSWORD CHECK
        if (!passwordEncoder.matches(studentLoginDto.getPassword(), studentEntity.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        //  GENERATE JWT TOKEN
        String jwtToken = jWTUtilClass.generateToken(studentEntity.getEmailId(), studentEntity.getRole());
        
        return "Login successful. Welcome " + studentEntity.getFullName() + 
               "\nJWT Token: " + jwtToken;
    }

    //   SECURE PASSWORD CHANGE
    public String changePassword(ChangePasswordRequest changePasswordRequest, String emailId) {
        StudentEntity student = studentRepository.findByEmailId(emailId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        //  BCrypt OLD PASSWORD CHECK
        if (!passwordEncoder.matches(changePasswordRequest.getOldpassword(), student.getPassword())) {
            throw new RuntimeException("Old password is incorrect");
        }

        if (!changePasswordRequest.getNewpassword().equals(changePasswordRequest.getConfirmpassword())) {
            throw new RuntimeException("Passwords do not match");
        }

        // HASH NEW PASSWORD
        student.setPassword(passwordEncoder.encode(changePasswordRequest.getNewpassword()));
        studentRepository.save(student);
        return "Password changed successfully";
    }
}
