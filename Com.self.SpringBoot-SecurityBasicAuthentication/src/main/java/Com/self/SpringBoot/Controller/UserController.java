package Com.self.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Entity.UserEntity;
import Com.self.SpringBoot.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public UserEntity register(@RequestBody UserEntity userEntity) {
		return userService.registerUser(userEntity);
	}
	
	@GetMapping("/secure")
	public String secureApi() {
		return "You are authenticated";
	}

}
