package Com.self.Spring.Operations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import Com.self.Spring.Entity.Staff;
import Com.self.Spring.Repository.StaffRepository;

@Component
public class DatabaseOpeartions {
	
	@Autowired
	StaffRepository staffRepository;
	
	public void loadEmployess() {
		
	List<Staff> staffs=	staffRepository.getAllStaff();
	staffs.forEach(System.out::println);
	
	}
	
	public void loadEmployeeByCity() {
		
		List<Staff> staffs=	staffRepository.getEmployeeByCity("Hyderabad");
		staffs.forEach(System.out::println);
		
		}
	
	public void loadEmployeeByCityAndGender() {
		List<Staff> staffs=	staffRepository.getEmployeeByCityAndGender("Chennai","Male");
		staffs.forEach(System.out::println);
	}
	
	public void loadEmployeeBycityAndAge(String city, int age) {
		List<Staff> staffs=	staffRepository.getEmployeeBycityandage(city,age);
		staffs.forEach(System.out::println);
	}
	
	public void newEmployee() {
	int count=	staffRepository.addEmployee(103,"Ram",27,1033.19,"INDIA","Chennai","Male");
		System.out.println(count);
	}
	
	public void deleteEmployee() {
		int count =staffRepository.deleteEmployee(129);
		System.out.println(count);
	}
	
	public void deleteEmpByAgeCity(String city, int age) {
		List<Staff> staffs=staffRepository.getEmployeeBycityandage(city, age);
		staffs.forEach(System.out::println);
	}
	
}
