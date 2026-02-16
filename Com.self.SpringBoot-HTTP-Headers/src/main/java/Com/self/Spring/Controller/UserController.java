package Com.self.Spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Com.self.Spring.Dto.UserInfo;

@RestController
public class UserController {
	
	@GetMapping("/load/{email}")
	public UserInfo loadUserByEmail(@PathVariable String email) {
		
		
		
		return new UserInfo("KSK","ksk@gmail.com","ksk123");
	}

}
