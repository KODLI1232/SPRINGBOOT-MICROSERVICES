package Com.self.Spring.Operations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.self.Spring.Entity.Student;
import Com.self.Spring.repository.StudentRepository;

@Component
public class DataBaseOperationsTwo {
	
	@Autowired
	StudentRepository studentRepository;
	
	public void addMoreStudents() {
		
		List<Student> allStudents =new ArrayList<>();
		
		allStudents.add(new Student(222,"MSKLA",459));
		allStudents.add(new Student(223,"CAT",456));
		allStudents.add(new Student(224,"DOG",455));
		studentRepository.saveAll(allStudents);
	}
	
	// we need to retrive all info
	// in sql we use select * from student;
	
	public void loadAllStudents() {
		
		List<Student>  alldetailsList=  studentRepository.findAll();
		System.out.println(alldetailsList);
		
	}
	
}
