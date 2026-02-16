package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext conatiner	=SpringApplication.run(Application.class, args);
	
	DatabaseOpeartions dbDatabaseOpeartions=	conatiner.getBean(DatabaseOpeartions.class);
		//dbDatabaseOpeartions.allEmployess();
	
	//dbDatabaseOpeartions.empinfoByNameAge();
	
//	dbDatabaseOpeartions.empinfoBycityIndexed("Hyderabad");
	
	dbDatabaseOpeartions.empinfoBycityNamed("Bengalore");
	}

}
