package Com.self.SpringBoot.Service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Com.self.SpringBoot.Entity.UserEntity;
import Com.self.SpringBoot.Repository.UserRepository;
import Com.self.SpringBoot.Request.ChangePasswordRequest;
import Com.self.SpringBoot.Request.UserInfoRequest;
import Com.self.SpringBoot.Request.UserLoginRequest;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	public String signupUser(UserInfoRequest userInfoRequest) {
		
		if(userRepository.findById(userInfoRequest.getEmailId()).isPresent()) {
			return "UserId already existed, Try with other UserID";
		
		}else {
		
			UserEntity userEntity = new UserEntity();
			
			userEntity.setEmailId(userInfoRequest.getEmailId());
			userEntity.setMobileNumber(userInfoRequest.getMobileNumber());
			userEntity.setUserName(userInfoRequest.getFullName());
			userEntity.setPassword(passwordEncoder.encode(userInfoRequest.getPassword()));
			
		 userRepository.save(userEntity);
		 return "Created Successfully";
	 }
	}

	public String signIn(UserLoginRequest userLoginRequest) {
		
	UserEntity userEntity =	userRepository.findByEmailIdAndPassword(userLoginRequest.getEmailId(), userLoginRequest.getPassword());
	
	if (userEntity!=null) {
		return "User Login Success , Welcome  "+userEntity.getFullName();
	}else {
	
		return "Invalid Credentials";
	 }
	}

	public String changePassword(ChangePasswordRequest changePasswordRequest, String userId) {
		
		Optional<UserEntity> infOptional=userRepository.findById(userId);
		if (infOptional.isPresent()) {
			
			UserEntity userEntity=infOptional.get();
			userEntity.setPassword(bCryptPasswordEncoder.encode(changePasswordRequest.getNewPassword()));
			
			userRepository.save(userEntity);
			
			return "Password Changed Successfully";
		}else {
			
			return "User Not Found"+userId;
		}
		
	}
	
//	public String changePassword(ChangePasswordRequest request, String userId) {
//
//	    // 1️⃣ Get logged-in user from SecurityContext
//	    Authentication authentication =
//	            SecurityContextHolder.getContext().getAuthentication();
//
//	    String emailId = authentication.getName(); // from JWT
//
//	    // 2️⃣ Fetch user by email
//	    UserEntity userEntity = userRepository.findByEmailId(emailId)
//	            .orElseThrow(() -> new RuntimeException("User not found"));
//
//	    // 3️⃣ Encode password (VERY IMPORTANT)
//	    userEntity.setPassword(passwordEncoder.encode(request.getNewPassword()));
//
//	    // 4️⃣ Save
//	    userRepository.save(userEntity);
//
//	    return "Password Changed Successfully";
//	}


	public String deleteUser( String emailId) {
		
		Optional<UserEntity> infOptional=userRepository.findById(emailId);
		if (infOptional.isPresent()) {
		userRepository.deleteById(emailId);
		
		return "User Deleted Successfully";
	}else {
		return "user Dosen't exist";
	}
}
}