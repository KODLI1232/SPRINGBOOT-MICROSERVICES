package Com.self.Spring.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.Spring.Request.CarBrandInfoRequest;
import Com.self.Spring.Request.CarInfo;

@RestController
public class ProductController {

	
	@PostMapping("/car/names")
	public String getCarNames(@RequestBody List<String>CarNames) {
		
		System.out.println("Feetched Cars "+CarNames);
		return "fetched all cars";
	}
	
	// only carInfo
	//client:JOSN RequestBody:JSON array of Objects
	@PostMapping("/cars/info")
	public String getCarsInfo(@RequestBody List<CarInfo> carInfoRequest) {
		
		carInfoRequest.forEach(System.out::println);
		
		return "cars info fetched";
	}
	@PostMapping("cars/brand/info")
	public String CarsofBrand(@RequestBody CarBrandInfoRequest carBrandInfoRequest) {
		
		
		System.out.println(carBrandInfoRequest.getBrandName());
		System.out.println(carBrandInfoRequest.getBrandinfos());
		
		
		return "Got all info of Car";
	}
}
