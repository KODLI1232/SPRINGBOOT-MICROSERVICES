package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.Operations.OrderOperations;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container	=SpringApplication.run(Application.class, args);
		
		OrderOperations dbDatabaseOperations=	container.getBean(OrderOperations.class);
		dbDatabaseOperations.loadall();
	}

}
