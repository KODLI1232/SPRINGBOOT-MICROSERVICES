package Com.self.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.Student;

public  interface  StudentRepository extends JpaRepository<Student, Integer> {
	
	

}
