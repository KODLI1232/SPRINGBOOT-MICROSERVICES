package Com.self.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Com.self.Spring.Service.UserMngtService;

@RestController
@RequestMapping("/contact")  // this will become base uri path for all uri paths
public class UserMngtController {

	@Autowired
	UserMngtService userMngtService;
	
	
	@RequestMapping(path ="/add/user" ,method = RequestMethod.POST) // the uri path will be localhost:8888/api/contact/add/user
	public String addUser() {
		String result=userMngtService.addUser();
		
		return result ;
		
	}
	
	@RequestMapping(path ="/delete/user" ,method = RequestMethod.DELETE)  // the uri path will be localhost:8888/api/contact/add/user
	public String deleteUser() {
		String result =userMngtService.deleteUser();
		return result;
	}
	
	@RequestMapping(path ="/update/user" ,method = RequestMethod.PUT)   // the uri path will be localhost:8888/api/contact/add/user
	public String UpdateUser() {
		
		String result =userMngtService.UpdateUser();
		return result;
	}
	
	//@RequestMapping(path ="/get/user" ,method = RequestMethod.GET)  // the uri path will be localhost:8888/api/contact/add/user
	@GetMapping(path ="/get/user")
	public String GetUserinfo() {
		
		String result =userMngtService.GetUserInfo();
		return result;
	}
	
	@RequestMapping(path ="/info/user" )  // it support all HTTP methods
	public String info() {
		
		return "Hiii";
	}
	
	
	// For Specific methods
	//@RequestMapping(path ="/inform/user",method = {RequestMethod.GET , RequestMethod.POST})  same as below
	@PostMapping(path  ="/inform/user") // the uri path will be localhost:8888/api/contact/add/user
	public String inform() { 
		
		return "Hiii";
	}
	
}
