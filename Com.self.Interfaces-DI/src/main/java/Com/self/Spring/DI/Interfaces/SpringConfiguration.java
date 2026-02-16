package Com.self.Spring.DI.Interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public Car car2() {
		return new Car();
	}

}
