package Com.self.Spring.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.Spring.Entity.UserDetailsEntity;
import Com.self.Spring.Repository.UserRepository;
import Com.self.Spring.Request.UserDetails;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public String addUser(UserDetails userDetails) {
	UserDetailsEntity userEntity=new UserDetailsEntity();
	userEntity.setName(userDetails.getName());
	userEntity.setMobileNumber(userDetails.getMobileNumber());
	userEntity.setCity(userDetails.getCity());
	userEntity.setAge(userDetails.getAge());
	userEntity.setGender(userDetails.getGender());
	userEntity.setQualification(userDetails.getQualification());
	userEntity.setCountry(userDetails.getCountry());
	
	userRepository.save(userEntity);
	return "User added successfully";
	
	}

//	public UserDetailsEntity getUserId(Integer userid) {
//		
//		return userRepository.findById(userid);
//	}
	
	
	public UserDetailsEntity getUserId(Integer userid) {

	    Optional<UserDetailsEntity> optionalUser = userRepository.findById(userid);

	    if (optionalUser.isPresent()) {
	        return optionalUser.get();
	    } else {
	        throw new RuntimeException("User not found with id: " + userid);
	    }
	}

}
