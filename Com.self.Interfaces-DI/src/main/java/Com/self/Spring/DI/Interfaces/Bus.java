package Com.self.Spring.DI.Interfaces;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{

	public Bus() {
		System.out.println("Bus is created");
	}
	
	@Override
	public String vehicleType() {

		return "this is new Bus";
	}
}
