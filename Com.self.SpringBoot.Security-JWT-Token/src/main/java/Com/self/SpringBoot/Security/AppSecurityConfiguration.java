package Com.self.SpringBoot.Security;



//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class AppSecurityConfiguration {

	//Logger logger= LoggerFactory.getLogger(AppSecurityConfiguration.class);
	
	// to defne bean methods
	@Bean
	AuthenticationManager getAuthenticationManager(AuthenticationConfiguration authenticationConfiguration) {
		
		System.out.println("Creating an insatnce of AuthenticationManager ");
		
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	// add password Encryption
	@Bean
     BCryptPasswordEncoder getBCryptPasswordEncoder(){
		
		System.out.println("BCryptPasswordEncoder");
		
		return new BCryptPasswordEncoder();
		
	}
	
	@Autowired
	JwtTokenFilter jwtTokenFilter;
	
	// security filter chain : public or protected
	
	@Bean
	 SecurityFilterChain securityConfig(HttpSecurity httpSecurity) {
		System.out.println("AppSecurityConfiguration : Configuring security rules: ");
		
		httpSecurity.csrf(csrf->csrf.disable())  // not allowed from other sites 
					.cors(cors->cors.disable())
					.authorizeHttpRequests(
											reqs->reqs.requestMatchers("/public/**")
											.permitAll() // no security // no tokrn filter // skip the security check
											.anyRequest()
											.authenticated()
											
											).addFilterBefore(this.jwtTokenFilter,UsernamePasswordAuthenticationFilter.class);
		
		
		return httpSecurity.build();
	}
}
