package Com.self.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Dtos.CustomerLoginDto;
import Com.self.SpringBoot.Dtos.CustomerRegisterDto;
import Com.self.SpringBoot.Dtos.CustomerResponseDto;
//import Com.self.SpringBoot.Request.CustomerRequest;
import Com.self.SpringBoot.Service.CustomerService;

@RestController
public class CustomerController {
	
//	@Autowired
//	CustomerService customerService;
//	
//	@PostMapping("/public/customer/signup")
//	public String signupCustomer(@RequestBody CustomerRequest customerRequest) {
//		
//		return customerService.customerSignUp(customerRequest);
//	}
//	
//	@PostMapping("/public/customer/login")
//	public ResponseEntity<String> loginCustomer(@RequestBody CustomerLoginDto customerLoginDto) {
//		
//		try {
//	        String response = customerService.customerLogin(customerLoginDto);
//	        return ResponseEntity.ok(response);
//	    } catch (Exception e) {
//	        return ResponseEntity.badRequest().body(e.getMessage());
//	    }
//	}
	
	@Autowired
    CustomerService customerService;

    @PostMapping("/public/customer/signup")
    public CustomerResponseDto signupCustomer(@RequestBody CustomerRegisterDto dto) {
        return customerService.customerSignUp(dto);
    }

    @PostMapping("/public/customer/login")
    public ResponseEntity<String> loginCustomer(@RequestBody CustomerLoginDto dto) {
        return ResponseEntity.ok(customerService.customerLogin(dto));
    }

}
