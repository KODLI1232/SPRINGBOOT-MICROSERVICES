package Com.self.DIFieldInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
		
//		Address address = new Address();
//		System.out.println(address.getCity());
//		System.out.println(address.getPincode());
		
		
		Address address=student.getAddress();
		System.out.println(address);
		System.out.println(address.getCity());
		System.out.println(address.getPincode());
		
		
	}

}
