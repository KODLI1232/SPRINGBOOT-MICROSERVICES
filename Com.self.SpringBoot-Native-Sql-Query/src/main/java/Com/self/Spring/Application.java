package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.Operations.DatabaseOpeartions;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container	=SpringApplication.run(Application.class, args);
		
		DatabaseOpeartions dbDatabaseOperations=	container.getBean(DatabaseOpeartions.class);
		//dbDatabaseOperations.loadEmployess();
		
		//dbDatabaseOperations.loadEmployeeByCityAndGender();
	
		//dbDatabaseOperations.loadEmployeeBycityAndAge("Bengalore",23);
		//dbDatabaseOperations.newEmployee();
		
		//dbDatabaseOperations.deleteEmployee();
		
		dbDatabaseOperations.deleteEmpByAgeCity("Bengalore", 21);
	}

}
