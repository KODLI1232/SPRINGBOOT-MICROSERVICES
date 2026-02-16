package Com.self.Spring.SpringRunners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Component
public class EmailNotificationRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("*********EmailNotificationRunner************");
		System.out.println("Your application is Ready to execute operations");
		System.out.println("Sending email to Developer Team");
		// logic to sent email
		
		System.out.println("Eamil sent");
	}
	public void runAnother() {
		System.out.println("This is not part of Runners");
	}

}
