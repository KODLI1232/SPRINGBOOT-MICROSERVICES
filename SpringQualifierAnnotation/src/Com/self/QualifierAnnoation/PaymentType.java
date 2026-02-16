package Com.self.QualifierAnnoation;

import org.springframework.stereotype.Component;

@Component("upiPay")
public class PaymentType {
	private String paymentType;
	
	public PaymentType() {
		System.out.println("Payment created");
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType=paymentType;
	}

}