package Com.self.Spring.DI.Interfaces;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public Bike() {
		System.out.println("New Bike is created.....");
	}
	
	@Override
	public String vehicleType() {
		// TODO Auto-generated method stub
		return "This is new Bike";
	}
	
	

}
