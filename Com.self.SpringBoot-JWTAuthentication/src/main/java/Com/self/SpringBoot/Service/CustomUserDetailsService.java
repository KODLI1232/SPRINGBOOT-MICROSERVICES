package Com.self.SpringBoot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import Com.self.SpringBoot.Entity.UserEntity;
import Com.self.SpringBoot.Repository.UserRepository;



@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username){
		
		UserEntity userEntity =userRepository.findByUsername(username)
										.orElseThrow(()->new UsernameNotFoundException("User Not Found"));
		return new User(userEntity.getUsername(), userEntity.getPassword(), List.of(new SimpleGrantedAuthority(userEntity.getRole())));
	}

}
