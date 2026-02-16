package Com.self.Spring.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import Com.self.Spring.Entity.Employess;

public interface EmployeeRepository  extends JpaRepository<Employess, Integer>{
	
	List<Employess> allEmployees =new ArrayList<>();
	

}
