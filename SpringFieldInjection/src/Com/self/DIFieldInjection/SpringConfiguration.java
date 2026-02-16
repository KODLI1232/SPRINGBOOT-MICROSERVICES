package Com.self.DIFieldInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("Com.*")
@Configuration
public class SpringConfiguration {

	
	@Bean
	public Address addressOne() {
		Address a = new Address();
		a .setCity("Hyd");
		a .setPincode(500072);
		return a ;

		}
}
