package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import Com.self.Spring.ValueAnnotation.AwsDBConfiguration;
import Com.self.Spring.ValueAnnotation.EmailCredentialConfiguration;
import Com.self.Spring.ValueAnnotation.OrderService;

@PropertySource(value= {"aws-DB.properties"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(Application.class, args);
	OrderService orderService =(OrderService) container.getBean(OrderService.class);
	System.out.println(orderService.getProductName());
	System.out.println(orderService.getProductId());
	System.out.println(orderService.getDeliveryCharge());
	System.out.println(orderService.getDeliverySevice());
	System.out.println(orderService.getDeliverySevice().getPasscode());
	
	System.out.println(orderService.getAppName());
	
	// Email configuration
	
	System.out.println("*******************EMAIL**************");
	EmailCredentialConfiguration email=(EmailCredentialConfiguration) container.getBean("emailCredentials");
	
	System.out.println(email.getEmailHost());
	System.out.println(email.getEmailId());
	System.out.println(email.getEmailPassword());
	
	// AWS 
	System.out.println("***************** AWS CONFIGURATION*******************");
	AwsDBConfiguration aws=(AwsDBConfiguration) container.getBean("awsDBConfiguration");
	System.out.println(aws);
	System.out.println(aws.getAwsHost());
	System.out.println(aws.getUserName());
	System.out.println(aws.getAwsPassword());
	}

}
