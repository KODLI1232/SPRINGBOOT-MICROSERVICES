package Com.self.SpringBoot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Com.self.SpringBoot.Entity.AdminEntity;
import Com.self.SpringBoot.Entity.ApplicationEntity;
import Com.self.SpringBoot.Entity.CompanyEntity;
import Com.self.SpringBoot.Entity.StudentEntity;
import Com.self.SpringBoot.Enums.ApplicationStatus;
import Com.self.SpringBoot.Repository.AdminRepository;
import Com.self.SpringBoot.Repository.ApplicationRepository;
import Com.self.SpringBoot.Repository.CompanyRepository;
import Com.self.SpringBoot.Repository.StudentRepository;
import Com.self.SpringBoot.Request.AdminRequest;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	 @Autowired
	    private AdminRepository adminRepository;
	    @Autowired
	    private PasswordEncoder passwordEncoder;
	    
	    public String signupAdmin(AdminRequest adminRequest) {
	        if (adminRepository.findByEmail(adminRequest.getEmail()) != null) {
	            return "Admin already exists";
	        }
	        
	        AdminEntity admin = new AdminEntity();
	        admin.setName(adminRequest.getName());
	        admin.setEmail(adminRequest.getEmail());
	        admin.setPassword(passwordEncoder.encode(adminRequest.getPassword()));
	        admin.setRole("ADMIN");
	        
	        adminRepository.save(admin);
	        return "Admin created successfully";
	    }
	
	// admin to view all students 
	public List<StudentEntity> getAllStudents(){
		return studentRepository.findAll();
	}
	
	// admin to view all companies 
	
	public List<CompanyEntity> getAllCompanies(){
		return companyRepository.findAll();
	}
	
	// admin to view applications students were applied 
	
	public List<ApplicationEntity> getAllApplications(){
		return applicationRepository.findAll();
	}
	
	// admin to update the students application status
	
	public String updateApplicationStatus(Long applicationId,ApplicationStatus status) {
		
		ApplicationEntity application= applicationRepository.findById(applicationId)
															.orElseThrow(()->new RuntimeException());
		application.setStatus(status);
		applicationRepository.save(application);
		
		return "Application Status Updated to "+status;
	}
}
