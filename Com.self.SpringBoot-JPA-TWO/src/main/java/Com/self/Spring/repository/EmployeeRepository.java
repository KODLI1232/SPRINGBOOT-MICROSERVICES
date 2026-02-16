package Com.self.Spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import Com.self.Spring.Entity.EmployeeDetails;


public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer>{

	List<EmployeeDetails> findByCountry(String country);
	
	List<EmployeeDetails> removeByCountry(String countrty);

}
