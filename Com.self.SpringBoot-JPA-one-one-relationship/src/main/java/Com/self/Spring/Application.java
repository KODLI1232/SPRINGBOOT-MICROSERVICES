package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.Operations.UserOperations;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container	=SpringApplication.run(Application.class, args);
	
	UserOperations userOperations=container.getBean(UserOperations.class);
	
	//userOperations.addUser();
	
	//userOperations.getUserByID();
	//userOperations.deleteById();
	
	userOperations.addUserWithOrders();
	
	}

}
