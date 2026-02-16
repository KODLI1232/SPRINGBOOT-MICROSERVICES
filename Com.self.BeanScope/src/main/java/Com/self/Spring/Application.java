package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import Com.self.Spring.BeanScopes.Order;
import Com.self.Spring.BeanScopes.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=SpringApplication.run(Application.class, args);
	
	Product product=	(Product) container.getBean("product");
	System.out.println(product);
	
	Product product2=	(Product) container.getBean("product");
	System.out.println(product2);
	
	Order order=	(Order) container.getBean("order");
	System.out.println(order);
	
	Order order2=	(Order) container.getBean("order");
	System.out.println(order2);
	System.out.println(order2.getProduct());
	
	System.out.println("************** New product************");
	
	Product p2=(Product) container.getBean("product2");
	System.out.println(p2);
	}
	@Bean
	Product product2() {
		return new Product();
	}

}
