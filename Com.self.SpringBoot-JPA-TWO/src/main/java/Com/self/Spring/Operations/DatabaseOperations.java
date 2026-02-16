package Com.self.Spring.Operations;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.self.Spring.Entity.EmployeeDetails;
import Com.self.Spring.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
@Component
public class DatabaseOperations {


		@Autowired   // injecting employeerepository class
		EmployeeRepository employeeRepository;
		
		// adding employess
		
		public void addEmployees() {
	
		List<EmployeeDetails> allEmployees =new ArrayList<>();
		
		allEmployees.add(new EmployeeDetails(121,"KSK",21,100.12,"INDIA"));
		allEmployees.add(new EmployeeDetails(122,"TSK",23,101.12,"USA"));
		allEmployees.add(new EmployeeDetails(123,"DSK",21,102.12,"INDIA"));
		allEmployees.add(new EmployeeDetails(123,"CSK",22,123.12,"RUSSIA"));
		allEmployees.add(new EmployeeDetails(124,"KLR",21,102.15,"HYDERABAD"));
		allEmployees.add(new EmployeeDetails(125,"MNR",21,101.15,"BANGLORE"));
		allEmployees.add(new EmployeeDetails(126,"NKR",21,120.15,"CHENNAI"));
		allEmployees.add(new EmployeeDetails(127,"CPR",21,111.15,"CHENNAI"));
		
		employeeRepository.saveAll(allEmployees);
		}
		
		//get data by emp_id
		
//		public void employeeInfo() {
//		List<EmployeeDetails> allDetails=employeeRepository.findAll();
//		allDetails.forEach(System.out::println);
//		}
//		
//		public void loadEmployeeByEmp_id() {
//			Optional<EmployeeDetails> empobj=employeeRepository.findById(121);
//			EmployeeDetails employeeDetails=empobj.get();
//			System.out.println(employeeDetails);
//		}
		
//		public void getEmployeeByCountryName(String countryName) {
//			System.out.println("by non primary key"+countryName);
//		List<EmployeeDetails> employee=employeeRepository.findByCountry("Chennai");
//		employee.forEach(System.out::println);
//		}
		public void employeeInfo() {
		employeeRepository.deleteById(121);
		}
		
		@Transactional
		public void removeByCountry(String country) {
			employeeRepository.removeByCountry(country);
		}
	}

