package Com.self.SpringBoot.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Request.ChangePasswordRequest;
import Com.self.SpringBoot.Request.UserInfoRequest;
import Com.self.SpringBoot.Request.UserLoginRequest;
import Com.self.SpringBoot.Security.JWTClass;
import Com.self.SpringBoot.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	JWTClass jwtClass;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@PostMapping("/public/user/signup")
	public String userSignUp(@RequestBody UserInfoRequest userInfoRequest) {
		
		return userService.signupUser(userInfoRequest);
	}
	
	@PostMapping("/public/user/signin")
	public ResponseEntity<String> userSignIn(@RequestBody UserLoginRequest userLoginRequest, String response) {
		
		// validation of credentials: whether username and password exists
		
		UsernamePasswordAuthenticationToken credentials = 
							new UsernamePasswordAuthenticationToken(userLoginRequest.getEmailId(),userLoginRequest.getPassword());
		
		try {
		Authentication authentication =	authenticationManager.authenticate(credentials);
		
		System.out.println(authentication.getCredentials());
		
		} catch (BadCredentialsException ex) {
			System.err.println("UserController : BadCredentialsException");
			response="Invalid Credentials";
			return new ResponseEntity<String>(response,HttpStatusCode.valueOf(401));
		}
		
		String token=jwtClass.createToken(userLoginRequest.getEmailId());
		HttpHeaders responseHeaders=new HttpHeaders();
		responseHeaders.add("Authorization",token);
		
		return new ResponseEntity<String>("Welcome Home "+userLoginRequest.getEmailId(),responseHeaders, HttpStatusCode.valueOf(200));
	}

	@PostMapping("/user/change/password/{userId}")
	public String changePassword(@RequestBody ChangePasswordRequest changePasswordRequest ,@PathVariable String userId) {	
		
		return userService.changePassword(changePasswordRequest,userId);
	}
//	@PostMapping("/user/change/password/{userId}")
//	public ResponseEntity<String> changePassword(
//	        @RequestBody ChangePasswordRequest changePasswordRequest,@PathVariable String userId) {
//
//	    return ResponseEntity.ok(userService.changePassword(request));
//	}

	
	@DeleteMapping("/user/delete/{emailId}") 
	public String deleteUser(@PathVariable String emailId) {
		
		return userService.deleteUser(emailId);
	}
}

