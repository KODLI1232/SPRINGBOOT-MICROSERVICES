package Com.self.Spring.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.self.Spring.Request.UserRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@PostMapping("/signup")
	public String UserRegister( @Valid @RequestBody UserRequest userrequest) {
		
		System.out.println("Printed requestbody"+userrequest);
		return "UserRegistered Successfully";
	}
	

}
