package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.Operations.DataBaseOperationsTwo;
import Com.self.Spring.Operations.DatabaseOperations;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=SpringApplication.run(Application.class, args);
	
	DatabaseOperations db = container.getBean(DatabaseOperations.class);
	db.addStudentinfo();
	db.addUserInfo();
	//db.deleteUserInfo();
	
	DataBaseOperationsTwo dataBaseOperationsTwo =container.getBean(DataBaseOperationsTwo.class);
	dataBaseOperationsTwo.addMoreStudents();
	
	dataBaseOperationsTwo.loadAllStudents();
	
	}

}
