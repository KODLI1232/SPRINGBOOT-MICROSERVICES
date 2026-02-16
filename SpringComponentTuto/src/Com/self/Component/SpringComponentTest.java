package Com.self.Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Com.self.Component.beans.Student;

public class SpringComponentTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		//
		Student student=(Student) container.getBean("student1");
		System.out.println(student);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getMarks());
		
		Student student2=(Student) container.getBean("student2");
		System.out.println(student2);
		System.out.println(student2.getId());
		System.out.println(student2.getName());
		System.out.println(student2.getMarks());
	}

}


// can we create bean object by using component and bean for predefined classes?
//Using @Bean → YES, you can create bean objects for predefined classes.
//Using @Component → NO, you cannot directly use it for predefined classes,
// because you can’t modify or annotate them (since you don’t own their source code).
