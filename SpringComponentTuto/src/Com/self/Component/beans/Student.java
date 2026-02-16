package Com.self.Component.beans;

import java.security.PrivateKey;

import org.springframework.stereotype.Component;

//@Component   // generally container  looks for bean id,if it found it takes that as bean id,
             //otherwise it takes className as bean id in camelCase form
			// component creates object by using constructor

@Component(value="student1")  // other form to pass bean id
//@Component("student1") // if we want to give our own bean id

// if we want to create multiple beans , in configuration class write bean method .
public class Student {
	
	private int id;
	private String name;
	private int marks;
	
	
	public Student() {
		System.out.println("Student created");
	}
	
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}

}

// we can't pass configuration values via component, if we want to pass values we have to use @bean method by using parameterized constructor
// @bean('student')
//public Student getStudent() {
//	return new Student(1,"ksk",76.2);
//}
