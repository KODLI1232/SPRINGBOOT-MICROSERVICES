package Com.self.Component;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Com.self.Component.beans.Student;

// To implement package Com.self.Component we use @componentscan 


@ComponentScan("Com.self")
@ComponentScan(basePackages = {"Com."})  /* To implement different packages like Com.,org.*/
@Configuration
public class SpringConfiguration {
	
	@Bean("student2")
	public Student getStudent2() {
		
		int totalMarks=55+55+66;
		return new Student(1,"KSk",totalMarks);
	}

}
