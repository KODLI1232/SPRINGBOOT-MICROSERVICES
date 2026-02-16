package Com.self.Spring.DI.Interfaces;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	
	public Car() {
		System.out.println("New Car created");
	}
	
	@Override
	public String vehicleType() {

		return "SUV";
	
	}
}
