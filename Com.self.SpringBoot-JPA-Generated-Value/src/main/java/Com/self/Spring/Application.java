package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.Operations.AmazonOperation;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(Application.class, args);
	
	AmazonOperation amazonOperation=container.getBean(AmazonOperation.class);
	for (int i = 1; i <10; i++) {
		amazonOperation.createOrder();
	}
	}

}
