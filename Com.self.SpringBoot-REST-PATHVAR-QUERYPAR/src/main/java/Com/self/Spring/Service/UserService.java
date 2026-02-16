package Com.self.Spring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.Spring.Entity.UserDetails;
import Com.self.Spring.Repository.UserRepository;
import Com.self.Spring.Request.UserRequest;
import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public String createUser(UserRequest userRequest) {
		UserDetails userDetails=new UserDetails();
		
		userDetails.setEmailId(userRequest.getEmailId());
		userDetails.setCity(userRequest.getCity());
		userDetails.setCountry(userRequest.getCountry());
		userDetails.setGender(userRequest.getGender());
		userDetails.setMobile(userRequest.getMobile());
		userDetails.setName(userRequest.getName());
		userDetails.setPassword(userRequest.getPassword());
		userDetails.setQualiifcation(userRequest.getQualiifcation());
		userDetails.setState(userRequest.getState());
		
		
		userRepository.save(userDetails);
		
		return "User Created successfully";
	}

	public List<UserDetails> loadallUsers() {
		
		return userRepository.findAll();
		
		// list to entity objects converted to response objects a
		
	}
//public List<UserDetails> getUserByEmailId(String emailId) {
//		
//		return userRepository.findByEmailId(emailId);
//	}

	public List<UserDetails> getUserByCity(String city) {
		
		return userRepository.findByCity(city);
	}

	public List<UserDetails> getUserByCityAndGender(String city,String gender) {
		// TODO Auto-generated method stub
		return userRepository.findByCityAndGender(city,gender);
	}

	public List<UserDetails> getUserByCountry(String country) {
		
		return userRepository.findByCountry(country);
	}

	public List<UserDetails> getUsersByCountryAndCity(String country, String city) {
		// TODO Auto-generated method stub
		return userRepository.findByCountryAndCity(country,city);
	}

	public String updatePassword(String newPassword, String emailId) {
	    
	    Optional<UserDetails> userinfo = userRepository.findByEmailId(emailId);

	    if (userinfo.isPresent()) {

	        UserDetails infoDetails = userinfo.get();
	        infoDetails.setPassword(newPassword);

	        userRepository.save(infoDetails);  // ✅ Save entity, not Optional

	        return "Password updated successfully.";
	    } else {
	        return "User not found.";
	    }
	}

	@Transactional
	public String deleteByEmail(String emailId) {
		Optional<UserDetails> userinfo = userRepository.findByEmailId(emailId);

	    if (userinfo.isPresent()) {

	        userRepository.deleteByEmailId(emailId);  // ✅ Save entity, not Optional

	        return "user deleted successfully.";
	        
	    } else {
	        return "Deletion failed,email not found.";
	    }
		
	}


}
