package Com.self.Spring.Operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.self.Spring.Entity.Employee;
import Com.self.Spring.Entity.Roles;
import Com.self.Spring.Repository.EmployeeRepository;
import Com.self.Spring.Repository.RolesRepository;

@Component
public class EmployeeOperations {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	RolesRepository rolesRepository;
	
	//add new employee
	
	public void addEmp() {
		
		Roles role1=new Roles(1,"SDE");
		rolesRepository.save(role1);
		
		Roles role2=new Roles(2,"DEV");
		rolesRepository.save(role2);
		
		Employee emp1 =new Employee(1,"KSK","MALE",List.of(role1,role2));
		
		employeeRepository.save(emp1);
	
	}
	
}
