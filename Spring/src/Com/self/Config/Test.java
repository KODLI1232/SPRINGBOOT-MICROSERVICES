package Com.self.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext container =new AnnotationConfigApplicationContext(SpringConfig.class);
		Student student=(Student) container.getBean("student1");
		System.out.println(student);
		System.out.println(student.getId());
		
		College clg =(College) container.getBean("college1");
		System.out.println(clg);
		System.out.println(clg.getCollegeName());
		System.out.println(clg.getCount());
		
		College clg1 =(College) container.getBean("college2");
		System.out.println(clg1);
		System.out.println(clg1.getCollegeName());
		System.out.println(clg1.getCount());
	}

}
