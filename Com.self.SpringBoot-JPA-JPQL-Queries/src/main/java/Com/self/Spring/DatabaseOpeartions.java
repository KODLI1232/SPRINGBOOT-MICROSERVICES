package Com.self.Spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseOpeartions {
	
	@Autowired
	StaffRepository staffRepository;
	
	public void allEmployess() {
	List<Staff> staffs=	staffRepository.loadAllEmployees();
	staffs.forEach(System.out::println);
	}
	
	public void empinfoByNameAge() {
		List<Integer> staffs=staffRepository.loadEmpNameAge();
		staffs.forEach(System.out::println);
	}
	public void empinfoBycityIndexed(String city) {
		List<String> staffs=staffRepository.getCityIndexed("Hyderabad");
		staffs.forEach(System.out::println);
	}
	
	public void empinfoBycityNamed(String city) {
		List<String> staffs=staffRepository.getCityNamed("Bengalore");
		staffs.forEach(System.out::println);
	}
}