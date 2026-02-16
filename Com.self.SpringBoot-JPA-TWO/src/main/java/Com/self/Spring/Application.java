package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.Operations.DatabaseOperations;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container	=SpringApplication.run(Application.class, args);
	
	DatabaseOperations dbDatabaseOperations=	container.getBean(DatabaseOperations.class);
	//dbDatabaseOperations.addEmployees();
	//dbDatabaseOperations.loadEmployeeByEmp_id();
	//dbDatabaseOperations.employeeInfo();
	
	/*dbDatabaseOperations.getEmployeeByCountryName("Chennai");*/
	dbDatabaseOperations.employeeInfo();
	
	dbDatabaseOperations.removeByCountry("CHENNAI");
	
	
	}

}
