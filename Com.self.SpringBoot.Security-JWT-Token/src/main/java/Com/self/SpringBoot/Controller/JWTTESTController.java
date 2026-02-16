package Com.self.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Security.JWTClass;

@RestController
public class JWTTESTController {

	@Autowired
	JWTClass jwtClass;
	
	
	@GetMapping("/jwt/create/token/{emailId}")
	public String getToken( @PathVariable String emailId) {
		
		
		return jwtClass.createToken(emailId);
	}
	
	@GetMapping("/jwt/validate/token")
	public Boolean validToken() {
		
		return jwtClass.isValidToken("eyJhbGciOiJIUzUxMiJ9.eyJhbGciOiJIUzI1NiJ9.e30.1tbsJDGiOMsq_8ureNF9BoNPT269F_fs77iW-kfjun8-Pa3XICAQbK8Q6cbAng6b7a_meCJz9JDBzgHzFUKEPWSp0FUZ_DdstN8H8-c3d-Uk7mdOvY7Oun2nmjvD4a1Q", "ks@gmail.com");
	}
	
}
