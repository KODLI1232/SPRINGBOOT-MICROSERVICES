package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.BeanLifeCycle.DataBaseConnection;
import Com.self.Spring.BeanLifeCycle.EmailConnection;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container =SpringApplication.run(Application.class, args);
	
//	System.out.println("Utilization state");
//	DataBaseConnection db =	(DataBaseConnection) container.getBean("dataBaseConnection");
//	System.out.println("Utilizing Bean"+db);
//	
//	System.out.println("Utilization state");
  //  DataBaseConnection db2 =	(DataBaseConnection) container.getBean("dataBaseConnection");
//	System.out.println("Utilizing Bean"+db2);
	
	// Email
	
	System.out.println("***** ANNOATION **********");
	
	 EmailConnection emailConnection =  (EmailConnection) container.getBean("emailConnection");
	 EmailConnection emailConnection2 =  (EmailConnection) container.getBean("emailConnection");
	 
	
	}

}
