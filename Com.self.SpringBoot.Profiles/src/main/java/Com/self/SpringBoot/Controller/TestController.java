package Com.self.SpringBoot.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TestController {

	@Value("${contact.email}")
	private String contactEmail;
	
	@GetMapping("/test")
	public void sendEmail() {
	
		System.out.println("Sending email to "+contactEmail);
		
	}
	
	
}
