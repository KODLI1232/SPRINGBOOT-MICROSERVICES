package Com.self.Spring.BeanLifeCycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Scope("prototype")
@Component
public class EmailConnection {
	
	
	public EmailConnection() {
		System.out.println("Email created");
	}

	@PostConstruct
	public void logicBeanCreation() {
		// we wrote logicc
		System.out.println("This is life cycle method : After construction and configuration");
	}
	@PreDestroy
	public void logicBeanDestrucion() {
		// we wrote logicc
		System.out.println("This is life cycle method : Before Destruction ");
	}
}
