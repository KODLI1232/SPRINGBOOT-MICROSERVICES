package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.Operations.DatabaseOpeartions;
import Com.self.Spring.Operations.GetEmployeeInfo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container	=SpringApplication.run(Application.class, args);
		
		DatabaseOpeartions dbDatabaseOperations=	container.getBean(DatabaseOpeartions.class);
		//dbDatabaseOperations.loadAllEmployees();
		//dbDatabaseOperations.addEmployees();
		
		//System.out.println("sorting on age");
		//dbDatabaseOperations.sortEmployessByage();
		
		//dbDatabaseOperations.sortEmployessByageDESC();
		//dbDatabaseOperations.sortEmployessByCityDESC();
	
		//dbDatabaseOperations.sortEmployessByCityAndAgeDESC();
		
		//dbDatabaseOperations.sortEmployessByCountryDESC();
	
		
		GetEmployeeInfo empObjEmployeeInfo=container.getBean(GetEmployeeInfo.class);
		
		//empObjEmployeeInfo.getEmpInfo();

		// load propertys per page
		
//		System.out.println("****************Load data per page**************");
//		empObjEmployeeInfo.getEmployeeInfo(2,3);
		
		empObjEmployeeInfo.getEmployeeInfoSortSalary(1,4);
	
//		System.out.println("****************Load Sort data per page**************");
		//empObjEmployeeInfo.getEmployeeInfoSort(1, 3);
	
//		System.out.println("****************Load data per page**************");
//		empObjEmployeeInfo.getEmployeeInfoSort(1, 3);
	
//		System.out.println("****************Load data per page uisng city and age**************");
//		empObjEmployeeInfo.getEmployeeInfoCIityAndAgeSortDESC(1, 3);
	
		
//		System.out.println("****************Load data per page uisng country and salary**************");
//		empObjEmployeeInfo.getEmployeeinfoCountryAndSalaryDESC(1, 4);
	}

}
