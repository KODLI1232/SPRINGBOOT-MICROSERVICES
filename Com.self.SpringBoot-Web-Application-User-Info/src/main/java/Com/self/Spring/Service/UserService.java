package Com.self.Spring.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.Spring.Entity.UserDetails;
import Com.self.Spring.Repository.UserRepository;

@Service
public class UserService {
	
	
	// Repository  
	
	@Autowired
	UserRepository userRepository;

	public String usersignup(String name,String email,String password) {
		
		System.out.println("Service layer Recevied Details form controller Sign-Up"+name+","+email+","+password);
		
		//send to repository:JPA
		// first we need to check email exists or not
		// if exists , display existed,no save
		// not exist , save operation
		
	Optional<UserDetails> user=userRepository.findById(email);
	if(user.isPresent()) {
		return "Email exists,try with new Mail";
	}
	else {
		
		UserDetails userDetails=new UserDetails();
		userDetails.setEmailId(email);
		userDetails.setFullName(name);
		userDetails.setPassword(password);
		
		userRepository.save(userDetails); // entity object
		
		
		return "  User Account created successfully,please login now";
		}
	}
	
	// verifying credentials
	
	public String userLogin(String email,String password){
		
	UserDetails userDetails=	userRepository.findByEmailIdAndPassword(email, password);
		
	if(userDetails!=null) {
		return "Welcome to page"+userDetails.getFullName();
	}else {
		return "invalid ,please try again";
	}
		
		
		
		
		
		
	}
}
