package Com.self.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.Spring.Entity.User;
import Com.self.Spring.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public String SignUp(User user) {
		
		if (userRepository.existsByEmail(user.getEmail())) {
			
			return "Email Already Exists";
		}
		userRepository.save(user);
		return "SignedUp Successfully";
		
	}

}
