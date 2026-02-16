package Com.self.QualifierAnnoation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentGate {
	
	private int amount;
	private String userEmailString;
	//@Qualifier("upiPay")
	//@Qualifier("debitPay")
	//@Qualifier("debitPay")     // bean created if we use @Primary at bean creation
								// Spring takes Qualifier as first priority
	@Autowired // throws exception
	           // But we need to make DI, so we injects the info to container don't fail DI , 
				//inject upi bean id object
	private PaymentType paymentType;  // upi,credit,debit
	// here in java, private variable can't be accessed outside
	// spring internally uses Reflection API to access the variable
	public PaymentGate() {
		System.out.println("PaymentGate is created");
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getUserEmailString() {
		return userEmailString;
	}

	public void setUserEmailString(String userEmailString) {
		this.userEmailString = userEmailString;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}
	
}

