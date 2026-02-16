package Com.self.Spring.Controller;



import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.Spring.Request.UserInfoRequest;
import Com.self.Spring.Request.UserLoginRequest;
import Com.self.Spring.Response.UserDetailsResponse;
import Com.self.Spring.Service.UserService;

@RestController
public class UserController {
	
	org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;

	@PostMapping("/user/create")
	public String createUser(@RequestBody UserInfoRequest UserInfoRequest) {
		
		// pass this to service layer
		
	String result=	userService.createUser(UserInfoRequest);
		
		return result;
	}
	
	// user login : CRUD:to read
	
	@PostMapping(path = "/user/login")
	public UserDetailsResponse userLogin(@RequestBody UserLoginRequest userLoginRequest) {

		logger.info("User Lodin Data"+userLoginRequest);
	UserDetailsResponse responseDetails=	userService.userLogin(userLoginRequest);
		
		return responseDetails;
		
	}
}
