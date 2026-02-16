package Com.Swiggy.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	@Bean("productTwo")
	public Product getProductTwo() {
		Product p2=new Product();
		System.out.println(p2);
		System.out.println("producttwo is created via bean method" +p2);
		return p2;
	}

}
