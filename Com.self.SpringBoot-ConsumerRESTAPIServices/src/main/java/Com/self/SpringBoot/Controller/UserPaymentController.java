package Com.self.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Service.UserPaymentService;

@RestController
public class UserPaymentController {
	
	@Autowired
	UserPaymentService userPaymentService;

	@GetMapping("/users/paymet/options")
	public List<String> allPaymentOptions(){
		
		System.out.println("In user payment controller:Consumer Apllication : ");
		
		return userPaymentService.getPaymentOptions();
	}
	
	@GetMapping("/call/netbanking")
	public String callNetBanking() {
		
		
		return userPaymentService.callNetBanking();
		
		
	}
	
}
