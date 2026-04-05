package Com.self.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Entity.UserEntity;
import Com.self.SpringBoot.Utility.JwtUtil;

@RestController
@RequestMapping("/api")
public class AuthController {
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping("/login")
	public String login(@RequestBody UserEntity userEntity) {
		
		Authentication authentication =authManager.authenticate(
												new UsernamePasswordAuthenticationToken(userEntity.getUsername(), 
																						userEntity.getPassword()));
		UserDetails userDetails=(UserDetails) authentication.getPrincipal();
		
		String token=jwtUtil.generateToken(userDetails);
		
		return token;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, You are authenticated";
	}
	
	@GetMapping("/user")
	public String user() {
		return "User details fetched Successfully";
	}
}
