package Com.self.Spring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //@RestController=@Controller(classlevel) + @ResponseBody(at each handler methods level)
public class UserController {

	// here we didn't added @ResponseBody, internally added by @RestController
	@RequestMapping(path = "/adduser",method = RequestMethod.GET)
	public String addUSer() {
		return "User added";
	}
	
	@RequestMapping(path = "/deleteuser",method = RequestMethod.GET)
	public String deleteUSer() {
		return "User deleted";
	}
}
