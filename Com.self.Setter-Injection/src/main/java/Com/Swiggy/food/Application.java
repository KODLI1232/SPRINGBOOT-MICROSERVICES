package Com.Swiggy.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import Com.Swiggy.food.delivery.OrderDelivery;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(Application.class, args);
	
//		Order order1=(Order) container.getBean("order");
//		System.out.println(order1);
//		System.out.println(order1.getProduct());
	
	OrderDelivery delivery=(OrderDelivery) container.getBean("orderDelivery");
	System.out.println(delivery.getOrder());
	System.out.println(delivery.getOrder().getProduct());
	}

}
