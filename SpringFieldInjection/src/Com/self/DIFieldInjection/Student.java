package Com.self.DIFieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
private int id;
private String name;

// Field Injection
@Autowired
private Address address;   // injecting through Address object

// No setter and Getter methods

public Student() {
	System.out.println("Student created");
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

public void setNameString(String nameString) {
	this.name = name;
}

public Address getAddress() {
	return address;
}



}
