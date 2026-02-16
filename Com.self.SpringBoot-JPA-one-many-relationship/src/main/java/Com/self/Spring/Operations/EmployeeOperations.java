package Com.self.Spring.Operations;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.self.Spring.Entity.Address;
import Com.self.Spring.Entity.Employee;
import Com.self.Spring.Repository.EmployeeRepository;

@Component
public class EmployeeOperations {

	
	@Autowired
	EmployeeRepository employeeRepository;
	
	//Add employee details
	
	public void addEmployee() {
		
		Address address =new Address();
		address.setCity("CHENNNAI");
		address.setPincode(500023);
		address.setCountry("INDIA");
		
		Employee employee=new Employee();
		employee.setName("TSK");
		employee.setGender("Female");
		employee.setAddress(address); // setting address object  into employee
		
		employeeRepository.save(employee);
				
	}
	
	public void deleteEmployee() {
		employeeRepository.deleteById(1001);
	}
	
	// read from database
	
	public void getEmpInfo() {
		
	Optional<Employee> empOptional=	employeeRepository.findById(1101);
	if(empOptional.isPresent()) {
		Employee employee =empOptional.get();
		System.out.println("Emp info :" +employee);
	}
	
	
	}
}
