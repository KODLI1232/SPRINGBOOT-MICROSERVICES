package Com.self.Spring.Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import Com.self.Spring.Entity.Employess;
import Com.self.Spring.Repository.EmployeeRepository;

@Component
public class DatabaseOpeartions {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	// adding employess
	
			public void addEmployees() {
		
			List<Employess> allEmployees =new ArrayList<>();
			
			allEmployees.add(new Employess(121,"KSK",21,100.12,"INDIA","Bengalore","Male"));
			allEmployees.add(new Employess(122,"TSK",23,101.12,"USA","Hyderabad","Female"));
			allEmployees.add(new Employess(123,"DSK",21,102.12,"INDIA","Chennai","Male"));
			allEmployees.add(new Employess(123,"CSK",22,1212.12,"RUSSIA","Hyderabad","Female"));
			allEmployees.add(new Employess(124,"KLR",21,102.15,"INDIA","Bengalore","Female"));
			allEmployees.add(new Employess(125,"MNR",21,101.15,"ISRAIL","Madrass","Male"));
			allEmployees.add(new Employess(126,"NKR",21,120.15,"USA","NewYork","Male"));
			allEmployees.add(new Employess(127,"CPR",21,111.15,"INDIA","Chennai","Male"));
			allEmployees.add(new Employess(128,"CPR",21,111.15,"INDIA","Coimbotore","Female"));
			
			employeeRepository.saveAll(allEmployees);
		    System.out.println(">>> Adding employees to database...");
			}
			
			public void updateEmployeeSalaryByEmpid(int emp_id,double salary) {
				Employess emp=new Employess();
				emp.setEmployeeId(emp_id);
				emp.setSalary(salary);
				employeeRepository.save(emp);
			}
			
			public void updateEmployeeSalaryByEid(int emp_id,double salary) {
			Optional<Employess> empOptional=	employeeRepository.findById(emp_id);
			
			if(empOptional.isPresent()) {
				Employess emp =empOptional.get();
				System.out.println("Employee found"+emp);
				
				// set data
				
				emp.setSalary(salary);
				
				System.out.println("Salary updated"+emp);
				// save method
				employeeRepository.save(emp);
			}
			}
}
