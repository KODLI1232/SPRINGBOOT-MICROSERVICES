package Com.self.SpringBoot.Security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
 

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtTokenFilter extends OncePerRequestFilter {

	@Autowired
	JWTClass jwtClass;
	
	@Autowired
	UserAuthenticationService userAuthenticationService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		//1.Token available or not
		// 2. header will consists of Authorization and its token
		
//		String jwtToken =request.getHeader("Authorization");
//		
//		String userId=null;
//		
//		
//		if (jwtToken!=null && !jwtToken.isBlank() && !jwtToken.isEmpty()) {
//			System.out.println("OncePerRequestFilter:Token Presented : Incoming token :"+jwtToken);
//			
//			// validate token
//			// we verify user and expirytime
//			
//			userId =jwtClass.getUserIdFromToken(jwtToken);
//			
//			System.out.println("request came from user :"+userId);
//			
//		}else {
//			System.out.println("OncePerRequestFilter:Token Not Presented : Please Add a Token");
//		}
		String authHeader = request.getHeader("Authorization");
		String jwtToken = null;
		String userId = null;

		if (authHeader != null && authHeader.startsWith("Bearer ")) {
		    jwtToken = authHeader.substring(7); // remove "Bearer "
		    System.out.println("Extracted JWT Token: " + jwtToken);

		    userId = jwtClass.getUserIdFromToken(jwtToken);
		} else {
		    System.out.println("JWT Token missing or invalid Authorization header");
		}

		
		// is Token userId is matching with Requested userId or not
		
		if (userId!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
		
			System.out.println("getting user info from database by passing user info from db by passing userid  : got from token");
			//get user info from database by apssing user id : got from token
			UserDetails userDetails =userAuthenticationService.loadUserByUsername(userId);
			
			// now passing userid fromm DB to token validator
			
			System.out.println("OncePerRequestFilter : Now vlidating token is expired or not & matching user name or not");
			
			Boolean isValidtokenBoolean = jwtClass.isValidToken(jwtToken, userDetails.getUsername());
			
			System.out.println("OncePerRequestFilter: Token validation result :"+isValidtokenBoolean);
			if(isValidtokenBoolean) {
				System.out.println("OncePerRequestFilter: Setting Security for usrrId");
				
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =new UsernamePasswordAuthenticationToken(userDetails, null,userDetails.getAuthorities());
//				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			} else {
				System.out.println("Token is invalid , please try with valid token");
			}
			
		}
		
		filterChain.doFilter(request, response);
		
	}

}