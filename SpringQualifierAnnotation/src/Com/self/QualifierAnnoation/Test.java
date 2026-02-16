package Com.self.QualifierAnnoation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ApplicationContext ctr = new AnnotationConfigApplicationContext(SpringbeanConfiguration.class);
	
		PaymentGate gate =(PaymentGate) ctr.getBean("paymentGate"); // here bean created through class(PaymentGate)
		
		PaymentType paymentType=gate.getPaymentType();
		System.out.println(paymentType);
		System.out.println(paymentType.getPaymentType());
		
		// beans of PaymentType
		
		System.out.println("beans of PaymentType: ");
		System.out.println(ctr.getBean("upiPay"));
		System.out.println(ctr.getBean("debitPay"));
		System.out.println(ctr.getBean("creditPay"));
	}

}
