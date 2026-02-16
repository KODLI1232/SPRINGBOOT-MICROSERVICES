package Com.self.Spring.DI.Interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Garage {
	
	// DI injected  implemented class objects
	
	@Qualifier("bike")
	@Autowired
	private Vehicle vehicle;
	
	public Garage() {
		System.out.println("Garage is created injected into vehicle .......");
	}
	
	public Garage(Vehicle vehicle) {
		System.out.println("Garage is created ND INJECTED WITH Vehicle......."+vehicle.getClass());
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
