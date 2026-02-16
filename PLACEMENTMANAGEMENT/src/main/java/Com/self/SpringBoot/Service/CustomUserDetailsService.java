package Com.self.SpringBoot.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import Com.self.SpringBoot.Entity.AdminEntity;
import Com.self.SpringBoot.Entity.StudentEntity;
import Com.self.SpringBoot.Repository.AdminRepository;
import Com.self.SpringBoot.Repository.StudentRepository;

@Configuration
public class CustomUserDetailsService implements UserDetailsService {

	  @Autowired
	    private StudentRepository studentRepository;
	    
	    @Autowired
	    private AdminRepository adminRepository;

	    @Override
	    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	        
	        //  Check Student first
	        Optional<StudentEntity> studentOpt = studentRepository.findByEmailId(email);
	        if (studentOpt.isPresent()) {
	            StudentEntity student = studentOpt.get();
	            return new org.springframework.security.core.userdetails.User(
	                student.getEmailId(),
	                student.getPassword(),
	                getAuthorities("STUDENT")
	            );
	        }
	        
	        // Check Admin
	        Optional<AdminEntity> adminOpt = adminRepository.findByEmail(email);
	        if (adminOpt.isPresent()) {
	            AdminEntity admin = adminOpt.get();
	            return new org.springframework.security.core.userdetails.User(
	                admin.getEmail(),
	                admin.getPassword(),
	                getAuthorities("ADMIN")
	            );
	        }
	        
	        //Not found
	        throw new UsernameNotFoundException("User not found: " + email);
	    }
	    
	    private Collection<? extends GrantedAuthority> getAuthorities(String role) {
	        return new ArrayList<GrantedAuthority>() {{
	            add(new SimpleGrantedAuthority("ROLE_" + role));
	        }};
	    }

}
