package Com.self.SpringBoot.Controller;


import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.dto.NetbankingInfo;
import Com.self.SpringBoot.dto.cardbankingInfo;

@RestController
public class PaymentController {

	// Net Banking service
	
	@PostMapping("/payment/netbanking")
	public String netBankingPayment(@RequestBody NetbankingInfo netbankingInfo) {
		
		//TODO integrate service and repository
		// validate userCredentials : existed :get account number && existing balance
		
		// validate paid amount: existing balance
		// payment success or failure
		// entity classes ,Database
		
		return "Payment Success, Your Id Is :"+generateTransactionId();
	}
	
	@PostMapping("/payment/creditcardbanking")
	public String creditCardBankingPayment(@RequestBody cardbankingInfo cardbankingInfo) {
		
		//TODO: integrate service and repository
		// validate cardCredentials : existed :get account number && existing balance
		// cvv matching ,Enter data is corrected or not
		// validate paid amount: existing balance
		// payment success or failure
		// entity classes ,Database
		
		return "Payment Success, Your Id Is :"+generateTransactionId();
	}
	
	@GetMapping("/payment/options")
	public List<String> getPaymentTypes(){
		
		return List.of("1.NetBanking","2.Credit Card","3.Debit card","4.UPI");
	}
	
	public static String generateTransactionId() {
		long timestamp=System.currentTimeMillis();
		int randomNum=new Random().nextInt(9999);
		return "TXN"+ timestamp+"-"+ String.format("%04d",randomNum);
	}
}
