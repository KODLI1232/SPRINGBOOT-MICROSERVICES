package Com.self.Spring.SpringRunners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class TextMessageNotification implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("*********TextMessageNotification************");
		System.out.println("Your application is Ready to execute operations");
		System.out.println("Sending Message to Developer Team");
		// logic to sent email
		
		System.out.println("Message sent");
		
	}

}
