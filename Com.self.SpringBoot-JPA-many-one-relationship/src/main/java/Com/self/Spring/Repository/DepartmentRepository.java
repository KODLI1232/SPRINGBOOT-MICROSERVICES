package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
