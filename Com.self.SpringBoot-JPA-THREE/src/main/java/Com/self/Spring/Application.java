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
		//dbDatabaseOperations.addEmployees();
		
		// dbDatabaseOperations.updateEmployeeSalaryByEmpid(121,1011.11);
		dbDatabaseOperations.updateEmployeeSalaryByEid(124,1113.11);
		
	}

}
