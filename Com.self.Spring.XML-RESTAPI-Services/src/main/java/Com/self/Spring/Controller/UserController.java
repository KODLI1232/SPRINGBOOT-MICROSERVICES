package Com.self.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.Spring.Entity.UserDetailsEntity;
import Com.self.Spring.Request.UserDetails;
import Com.self.Spring.Service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
//	@PostMapping(path="/add/user",consumes=MediaType.APPLICATION_XML_VALUE)  // supports XML
	
	
	// supports XML / JSON
	@PostMapping(path="/add/user",consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public String addUser(@RequestBody UserDetails userDetails) {
		
		System.out.println("Request Received "+ userDetails);
		
		return userService.addUser(userDetails);
	}
	
	
	@GetMapping("/user/{userid}")
	public UserDetailsEntity getUserId(@PathVariable Integer userid) {
		
		return userService.getUserId(userid);
	}
}
