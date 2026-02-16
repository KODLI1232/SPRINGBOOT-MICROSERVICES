package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.SpringRunner.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Befor run method");
		
		ConfigurableApplicationContext container =SpringApplication.run(Application.class, args);
		
		System.out.println("Applictaion run method completed");
	
		System.out.println("**************Spring Boot Application Started************");
		
		Product product =container.getBean(Product.class);
		
		System.out.println(product);
	}

}
