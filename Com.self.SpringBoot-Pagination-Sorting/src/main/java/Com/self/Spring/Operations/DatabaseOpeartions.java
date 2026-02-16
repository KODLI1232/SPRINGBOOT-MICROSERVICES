package Com.self.Spring.Operations;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import Com.self.Spring.Entity.Staff;
import Com.self.Spring.Repository.StaffRepository;

@Component
public class DatabaseOpeartions {
	
	@Autowired
	StaffRepository staffRepository;
	
	// adding employess
	
			public void addEmployees() {
		
			List<Staff> allEmployees =new ArrayList<>();
			
			allEmployees.add(new Staff(121,"KSK",21,100.12,"INDIA","Bengalore","Male"));
			allEmployees.add(new Staff(122,"TSK",23,101.12,"USA","Hyderabad","Female"));
			allEmployees.add(new Staff(123,"DSK",20,102.12,"INDIA","Chennai","Male"));
			allEmployees.add(new Staff(124,"CSK",18,1212.12,"RUSSIA","Hyderabad","Female"));
			allEmployees.add(new Staff(125,"KLR",19,102.15,"INDIA","Bengalore","Female"));
			allEmployees.add(new Staff(126,"MNR",17,101.15,"ISRAIL","Madrass","Male"));
			allEmployees.add(new Staff(127,"NKR",21,120.15,"USA","NewYork","Male"));
			allEmployees.add(new Staff(128,"CPR",25,111.15,"INDIA","Chennai","Male"));
			allEmployees.add(new Staff(129,"PR",20,111.15,"INDIA","Coimbotore","Female"));
			
			staffRepository.saveAll(allEmployees);
		    System.out.println(">>> Adding employees to database...");
			}
			
			public void loadAllEmployees() {
				
				List<Staff>  alldetailsList=  staffRepository.findAll();
				alldetailsList.forEach(System.out::println);
				
			}
			
			public void sortEmployessByage() {
				List<Staff> staffs=staffRepository.findAll(Sort.by("age"));
				
				staffs.forEach(System.out::println);
			
			}
			
			public void sortEmployessByageDESC() {
				List<Staff> staffs=staffRepository.findAll(Sort.by(Direction.DESC, "age"));
				staffs.forEach(System.out::println);
			
			}
			public void sortEmployessByCityDESC() {
				List<Staff> staffs=staffRepository.findAll(Sort.by(Direction.DESC, "city"));
				staffs.forEach(System.out::println);
			
			}
			public void sortEmployessByCityAndAgeDESC() {
				List<Staff> staffs=staffRepository.findAll(Sort.by(Direction.DESC, "city","age"));
				staffs.forEach(System.out::println);
			
			}
			public void sortEmployessByCountryDESC() {
				List<Staff> staffs=staffRepository.findAll(Sort.by(Direction.DESC,"country"));
				staffs.forEach(System.out::println);
			}
}
