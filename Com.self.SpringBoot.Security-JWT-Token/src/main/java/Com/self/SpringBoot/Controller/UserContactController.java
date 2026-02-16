package Com.self.SpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContactController {

	@GetMapping("/public/contact/info")
	public String getContactInfo() {
		
		
		return "call : 7965412536";
	}
	
}
