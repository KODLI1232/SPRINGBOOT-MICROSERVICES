package Com.self.Spring.Controller;

import org.springframework.web.bind.annotation.RestController;

import Com.self.Spring.Entity.UserDetails;
import Com.self.Spring.Request.UserDTO;
import Com.self.Spring.Request.UserRequest;
import Com.self.Spring.Reuest.ChangePasswordRequest;
import Com.self.Spring.Service.UserService;

import java.awt.geom.CubicCurve2D;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	// create user
	@PostMapping("/create/user")
	public String CreateUser(@RequestBody UserRequest userRequest) {
		String result= userService.createUser(userRequest);
		return result;
	}
	
	@GetMapping("/load/users")
	public List<UserDetails> getallUsers() {
		
		
		return userService.loadallUsers();
		
	}
	
//	@GetMapping("/load/users/emailId/{emailId}")
//	public List<UserDetails> getUserByEmailId(@PathVariable(name="emailId") String emailId) {
//		
//		return userService.getUserByEmailId(emailId);
//	
//	}
	
	@GetMapping("/load/users/{city}")
	public List<UserDetails> getUserByCityName(@PathVariable(name="city") String city) {
		
		return userService.getUserByCity(city);
	}
	
	@GetMapping("/load/users/{city}/{gender}")
	public List<UserDetails> getUserByCityAndGender(@PathVariable(name="city") String city,@PathVariable(name="gender")String gender) {
		
		return userService.getUserByCityAndGender(city,gender);
	}
	
	
	// @QueryParam   - get info by country
	// dont define  '?' -symbol
	
	@GetMapping("/users/search/param")
	public List<UserDetails> getUsersByCountry(@RequestParam("country") String country ) {
		
		System.out.println("get user by country" + country);
		
		return userService.getUserByCountry(country);
	}
	
	@GetMapping("/users/search")
	public List<UserDetails> getUsersByCountryAndCity(@RequestParam("country") String country ,@RequestParam String city) {
		
		System.out.println("get user by country" + country +  "And" + city);
		
		return userService.getUsersByCountryAndCity(country,city);
	}
	
	@GetMapping("/users/search/optional")
	public List<UserDetails> UsersByCountryAndCity(@RequestParam(required = false) String country ,@RequestParam(required = false) String city) {
		
		System.out.println("get user by country" + country +  "And" + city);
		if(country !=null && city!=null) {
		return userService.getUsersByCountryAndCity(country,city);
	} else if (country!=null && city==null) {
		return userService.getUserByCountry(country);
	}
	else if(country==null && city!=null){
		return userService.getUserByCity(city);
	}else {
		return userService.loadallUsers();
	}
	}
	
	@PutMapping("/users/update/{emailId}")
	public String putMethodName(@PathVariable String emailId, @RequestBody ChangePasswordRequest request) {
		//TODO: process PUT request
		
		return	userService.updatePassword(request.getNewPassword(),emailId);
	
	}
	
	@DeleteMapping("/users/delete/{emailId}")
	public String deleteByEmail(@PathVariable String emailId) {
		
		
		return userService.deleteByEmail(emailId);
	}
	
}
