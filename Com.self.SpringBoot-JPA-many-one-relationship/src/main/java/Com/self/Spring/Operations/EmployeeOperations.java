package Com.self.Spring.Operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.self.Spring.Entity.Department;
import Com.self.Spring.Entity.Employee;
import Com.self.Spring.Repository.DepartmentRepository;
import Com.self.Spring.Repository.EmployeeRepository;

@Component
public class EmployeeOperations {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	
	//add new employee
	public void addEmployee() {
		
		Department dept1=new Department(1,"HR");
		departmentRepository.save(dept1);
		
		Employee emp1=new Employee(111,"KSK","Male",dept1);
		employeeRepository.save(emp1);
		
		Employee emp2=new Employee(112,"ISHA","Female",dept1);
		employeeRepository.save(emp2);
		
		// next dept
		
		Department dept2=new Department(2,"SDE");
		departmentRepository.save(dept2);
		
		Employee emp3=new Employee(113,"TSK","Male",dept2);
		employeeRepository.save(emp3);
		
		Employee emp4=new Employee(114,"PRIYA","Female",dept2);
		employeeRepository.save(emp4);
	}
}
