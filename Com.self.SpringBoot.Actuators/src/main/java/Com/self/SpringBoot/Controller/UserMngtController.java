package Com.self.SpringBoot.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMngtController {

	@PostMapping("/add/user")
	public String addUser(){
		
		
		return "add user";
		
	}
}
