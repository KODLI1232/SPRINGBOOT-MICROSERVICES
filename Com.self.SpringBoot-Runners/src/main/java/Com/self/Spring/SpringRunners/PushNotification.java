package Com.self.Spring.SpringRunners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PushNotification implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("*********PushNotification************");
		System.out.println("Your application is Ready to execute operations");
		System.out.println("Sending  PushNotification to Developer Team");
		
	}
	
	

}
