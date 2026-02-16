package Com.self.SpringBoot.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfiguration {
	
	@Autowired
	private JwtRequestFilter jwtRequestFilter;

	@Bean
	@Primary
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http,JwtRequestFilter jwtFilter) throws Exception{
		
		http.csrf(csrf->csrf.disable())
			.authorizeHttpRequests(auth-> auth 
					.requestMatchers("/public/**").permitAll()
					.requestMatchers("/student/allcompanies").permitAll()
					
					.requestMatchers("/api/applications/apply/**").hasRole("STUDENT")
					.requestMatchers("/api/applications/student/**").hasRole("STUDENT")
					.requestMatchers("/user/**").hasAnyRole("STUDENT")
					.requestMatchers("/admin/**").hasRole("ADMIN")
					.requestMatchers("/api/admin/**").hasRole("ADMIN")
					.anyRequest()
					.authenticated()
		)
			.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .addFilterBefore( jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);	
		return http.build();
	}
	
	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//	    http.csrf(csrf -> csrf.disable())
//	       .authorizeHttpRequests(auth -> auth
//	           .anyRequest().permitAll()  // 🔥 EVERYTHING OPEN
//	       )
//	       .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//	    return http.build();
//	}

}
