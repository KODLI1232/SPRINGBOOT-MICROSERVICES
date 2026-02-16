package Com.self.Spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	// Req: Welcome to RESt services by KSK
	
	@ResponseBody    // rest endpoint
	@RequestMapping(path = "/welcome",method=RequestMethod.GET)
	public String WelcomeMsg() {
		
		return "Welcome to REST services by KSK";   // view name
	}
	

}
