package Com.self.SpringBoot.Security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import Com.self.SpringBoot.Entity.UserEntity;
import Com.self.SpringBoot.Repository.UserRepository;

@Component
public class UserAuthenticationService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
		
		// loads data from DB for a specific user
		
		System.out.println("UserAuthenticationService :loading data from DB of user" +emailId);
		
		Optional<UserEntity>	userOptional= userRepository.findById(emailId);
		
		if (userOptional.isPresent()) {
			System.err.println("Email found in database: "+emailId);
			return userOptional.get();
		}else {
			System.err.println("Email not found in database :"+emailId);
			throw new UsernameNotFoundException("Email not found in database"+emailId);
		}
	}

}
