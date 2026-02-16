package Com.self.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Dtos.StudentLoginDto;
import Com.self.SpringBoot.Request.ChangePasswordRequest;
import Com.self.SpringBoot.Request.StudentRequest;
import Com.self.SpringBoot.Service.Studentservice;

@RestController
//@RequestMapping("/placement")
public class StudentController {

	@Autowired
	Studentservice studentService;
	
	@PostMapping("/public/student/signup")
	public String studentSignUp(@RequestBody StudentRequest studentRequest) {
		
		return studentService.signupStudent(studentRequest);
	}
	
	@PostMapping("/public/student/login")
	public ResponseEntity<String> studentLogin(@RequestBody StudentLoginDto studentLoginDto) {
	    try {
	        String response = studentService.signinStudent(studentLoginDto);
	        return ResponseEntity.ok(response);
	    } catch (Exception e) {
	        return ResponseEntity.badRequest().body(e.getMessage());
	    }
	}

	@PreAuthorize("hasAnyRole('STUDENT')")
	@PutMapping("/user/change/password/{emailId}")
	public ResponseEntity<String> changePassword(
		    @PathVariable String emailId,
		    @RequestBody ChangePasswordRequest request,
		    Authentication authentication) {
		    
		    // Your password change logic
		    return ResponseEntity.ok("Password changed successfully");
		}
	
	@GetMapping("/debug")
	public ResponseEntity<String> debug(Authentication auth) {
	    return ResponseEntity.ok(
	        "Authenticated: " + (auth != null) + 
	        "\nName: " + (auth != null ? auth.getName() : "NULL") + 
	        "\nAuthorities: " + (auth != null ? auth.getAuthorities() : "NULL")
	    );
	}

	
}
