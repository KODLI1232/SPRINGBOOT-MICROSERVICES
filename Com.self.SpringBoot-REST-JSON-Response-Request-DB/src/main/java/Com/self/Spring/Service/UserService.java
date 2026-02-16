package Com.self.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.Spring.Entity.UserDetails;
import Com.self.Spring.Repository.UserRepository;
import Com.self.Spring.Request.UserInfoRequest;
import Com.self.Spring.Request.UserLoginRequest;
import Com.self.Spring.Response.UserDetailsResponse;
@Service
public class UserService {
	
	//From service to repository
	// Integrate repository layer
	@Autowired
	 UserRepository userRepositorty;

	
	public String createUser(UserInfoRequest userInfoRequest) {
		
		// repository layer
		// pass entitiy object : userinforequest class is the entity class? Ans: No
		// we have to data mapping / data transfer form one object to another object
		
		
		UserDetails userData=new UserDetails();
		userData.setFirstName(userInfoRequest.getFirstName());
		userData.setLastName(userInfoRequest.getLastName());
		userData.setEmailID(userInfoRequest.getEmailID());
		userData.setAge(userInfoRequest.getAge());
		userData.setMobileNo(userInfoRequest.getMobileNo());
		userData.setPassword(userInfoRequest.getPassword());
		
		
		if(userRepositorty.findById(userInfoRequest.getEmailID()).isEmpty()) {
		userRepositorty.save(userData);
		return "User created successfully";
		}
		
	
		return "User already existed ";
	}
	
	// make call to DB
	public UserDetailsResponse userLogin(UserLoginRequest userLoginRequest) {
		
	UserDetails dataDetails=	userRepositorty.findByEmailIDAndPassword(userLoginRequest.getEmailID(),userLoginRequest.getPassword());
		
	// map data from entity to DTO object(by creating POJO class)
	
	if(dataDetails!=null) {
		
	UserDetailsResponse userDetailsResponse=new UserDetailsResponse();
	
	userDetailsResponse.setFirstName(dataDetails.getFirstName());
	userDetailsResponse.setLastName(dataDetails.getLastName());
	userDetailsResponse.setAge(dataDetails.getAge());
	userDetailsResponse.setEmailID(dataDetails.getEmailID());
	userDetailsResponse.setMobileNo(dataDetails.getMobileNo());
	
	return userDetailsResponse;
	}
	else
		return null;
	}

}
