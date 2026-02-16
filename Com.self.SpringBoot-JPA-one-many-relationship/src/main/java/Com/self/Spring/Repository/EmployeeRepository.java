package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	
}
