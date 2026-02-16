package Com.self.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.self.Spring.RequestClass.AddressRequest;
import Com.self.Spring.RequestClass.UserSignUpRequest;
import Com.self.Spring.Service.Address;
import Com.self.Spring.Service.UserMngtService;

@RestController
@RequestMapping("/user")
public class UserAccountController {
	
	@Autowired
	UserMngtService userMngtService;
	
	
	// Http method :here create opertion : POST
	
	@PostMapping("/signup")
	public String userSignUp(@RequestBody UserSignUpRequest userSignUpRequest) {
		//We mention the RequestBody class in the controller method so
		//that Spring knows the shape of the incoming JSON and 
		//can automatically convert the request body into a Java object using Jackson. 
		//The @RequestBody annotation tells Spring to read data from the HTTP body instead of URL.
	
//✅ Why we annotate the parameter with @RequestBody?
//Because this tells Spring:
// “Take the JSON from the HTTP request body and convert it into the UserRequest object.”
		
		System.out.println(userSignUpRequest);
		
	String result =userMngtService.userSignUp(userSignUpRequest);
		return result;
	}
	
	// 2nd Restservice
	
	@PostMapping("/address")
	//method parameter
	public String addAddress(@RequestBody AddressRequest addressRequest) {
		
		System.out.println("User address info"+addressRequest);
		
		// Service-> Repository(Interface ,Entity class)-> DB
		return " Address added";
	}
	
	// Response
	
	@GetMapping("/get/address")
	public Address getAddress() {
		 // data from servvice layer
		
		Address address = new Address();
		address.setFlat("101,HSBD");
		address.setArea("Jeevean Nagar");
		address.setCity("Hyderabad");
		address.setState("Telangana");
		address.setCountry("India");
	
		// returning response request
		
		
		// above converted to json
		// if we give XML it generates error, 500 intrnal server error
		return address;
		
	}

}
