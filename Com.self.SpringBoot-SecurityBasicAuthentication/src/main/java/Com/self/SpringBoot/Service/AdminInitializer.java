package Com.self.SpringBoot.Service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import Com.self.SpringBoot.Entity.UserEntity;
import Com.self.SpringBoot.Repository.UserRepository;

@Component
public class AdminInitializer {

	@Bean
	public CommandLineRunner createAdminUser(UserRepository userRepository,PasswordEncoder passwordEncoder) {
		return args->{
			if(userRepository.findByUsername("admin").isEmpty()) {
				UserEntity admin =new UserEntity();
				
				admin.setUsername("admin");
				admin.setPassword(passwordEncoder.encode("admin1234"));
				admin.setRole("ROLE_ADMIN");
				
				userRepository.save(admin);
				System.out.println("Defalut admin user created");
			}
		};
	}
}
