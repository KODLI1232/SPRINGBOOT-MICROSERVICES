package Com.self.QualifierAnnoation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@ComponentScan("Com.*")
@Configuration
public class SpringbeanConfiguration {
	
	@Primary // same as Qualifier
	@Bean
	public PaymentType creditPay() {
	PaymentType payment=new PaymentType();
	payment.setPaymentType("Credit pay");
	return payment;
	}

	//@Primary  // same as Qualifier, we can give at component level also
	@Bean
	public PaymentType debitPay() {
	PaymentType payment=new PaymentType();
	payment.setPaymentType("debit pay");
	return payment;
}
}
