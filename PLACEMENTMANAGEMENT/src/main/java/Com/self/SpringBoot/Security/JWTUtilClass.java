package Com.self.SpringBoot.Security;



import java.util.Date;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;


@Component
public class JWTUtilClass {
	
	private SecretKey secretKey=Keys.secretKeyFor(SignatureAlgorithm.HS256);
	private final long JWT_TOKEN_VALIDITY=1000*60*60*10;
	
	
	// using emailId to generate a token
	 public String generateToken(String username, String role) {
	        return Jwts.builder()
	                .claim("role", role)  // ✅ SIMPLE STRING (not HashMap)
	                .subject(username)
	                .issuedAt(new Date(System.currentTimeMillis()))
	                .expiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY))
	                .signWith(secretKey)
	                .compact();
	    }


	public Boolean validateToken(String token,String emailId) {
		final String tokenEmailId=extractUsername(token);
		return (tokenEmailId.equals(emailId) && ! isTokenExpired(token));
	}

	String extractUsername(String token) {
		
		return extractClaim(token,Claims::getSubject);
	}
	
	public String extractRole(String token) {
		
		return extractClaim(token,claimsMap-> claimsMap.get("role",String.class));
	}
	
	public Date extractExpiration(String token) {
		return extractClaim(token,Claims::getExpiration);
	}
	
	private <T> T extractClaim(String token,Function<Claims,T> claimsResolver) {
		final Claims claims=extractAllClaims(token);
		return claimsResolver.apply(claims);
	}
	
	private Claims extractAllClaims(String token) {
		return Jwts.parser()
				.verifyWith(secretKey)
				.build()
				.parseSignedClaims(token)
				.getPayload();
	}
	private Boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}

}
