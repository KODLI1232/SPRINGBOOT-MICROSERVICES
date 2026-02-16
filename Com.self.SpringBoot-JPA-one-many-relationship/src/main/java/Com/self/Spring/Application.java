package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.Operations.EmployeeOperations;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container	=SpringApplication.run(Application.class, args);
	
	EmployeeOperations ops=container.getBean(EmployeeOperations.class);
	
	//ops.addEmployee();
	
	//ops.deleteEmployee();
	
	ops.getEmpInfo();
	}

}
