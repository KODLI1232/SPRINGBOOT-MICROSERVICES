package Com.self.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Com.self.Spring.Service.UserService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	
	// DI
	@Autowired
	public UserService userService;

	// request method to load signup form
	
	@RequestMapping(method = RequestMethod.GET,path="/sign-up")
	public String loadSignupForm() {
		
		return "user-register";
	}
	
	@RequestMapping(method = RequestMethod.POST,path="/account/sign-up")
	
	public ModelAndView userSignUp(HttpServletRequest request) {
		
		String name= request.getParameter("fullName");
		String email= request.getParameter("email");
		String password= request.getParameter("psw");
		
		System.out.println("Received Details for Sign-Up"+name+","+email+","+password);
		// service layer
		// from controller/service we can send data to database, but it is not right method to do
	String result=userService.usersignup(name, email, password);
		
	ModelAndView mView=new ModelAndView();
	mView.setViewName("message");
	mView.addObject("response",result);
	
	return mView;
	}
	
	// login : from :String/ modelandview
	
	@RequestMapping(path = "/sign-in",method = RequestMethod.GET)
	public ModelAndView userLoginForm() {
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("user-login");
		
		return modelAndView;
	}
	
//	<form action=account/Signing method=POST>
	
	@RequestMapping(method = RequestMethod.POST,path="/sign-in")
	public ModelAndView userSignIn(HttpServletRequest request) {
		
		String email= request.getParameter("email");
		String password= request.getParameter("psw");
		
		// can we go to db mean :NO
		// pass info to service
		
	String result=	userService.userLogin(email, password);
		
	ModelAndView mAndView= new ModelAndView();
	mAndView.setViewName("message");
	mAndView.addObject("response",result);
	
		
		return mAndView;
		
	}
}
