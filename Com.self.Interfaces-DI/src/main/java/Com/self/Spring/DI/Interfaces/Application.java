package Com.self.Spring.DI.Interfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=SpringApplication.run(Application.class, args);
	
	Garage garage =(Garage) container.getBean("garage");
	System.out.println(garage);
	
	Vehicle vehicle =garage.getVehicle();
	System.out.println(vehicle.getClass());
	
	System.out.println(vehicle.vehicleType());
	}

}
