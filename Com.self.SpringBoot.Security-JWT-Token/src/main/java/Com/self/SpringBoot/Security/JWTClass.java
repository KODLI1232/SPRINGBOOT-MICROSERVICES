package Com.self.SpringBoot.Security;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;


@Component
public class JWTClass {
	
	// create logic implementation

	//secretkey
	private final String secret_Key ="qw34567yuhgvcde45678iujnbvcde3456789iokmnbvcsw34567890pokmnujnbvcdfghjolowsdxcfghh45862mmnhj667bvcde345678uhb";
	
	private final long Token_expiry = 5*60000;
	
	private SecretKey getSecretKey() {
	    return Keys.hmacShaKeyFor(secret_Key.getBytes());
	}

	
	public String createToken(String emailId) {
	    return Jwts.builder()
	            .subject(emailId)          //  REQUIRED
	            .issuedAt(new Date())
	            .expiration(new Date(System.currentTimeMillis() + Token_expiry))
	            .signWith(getSecretKey(), Jwts.SIG.HS256)
	            .compact();
	}


	
	
	// Decode and get user id from token
	
	public String getUserIdFromToken(String token) {
			
		return Jwts.parser()  // reading
					.verifyWith(getSecretKey())
					.build()
					.parseSignedClaims(token)
					.getPayload()
					.getSubject();
		}

	private boolean isTokenExpired(String token) {
		
		Date expiryTime=Jwts.parser()
							.verifyWith(getSecretKey())
							.build()
							.parseSignedClaims(token)
							.getPayload()
							.getExpiration();
		
		System.out.println("Token Expiry Time :"+expiryTime);
		
		
		return expiryTime.before(new Date());   // Expire time after currrent time
												// ex: we set exp time as 9:26 , current time is 9:27 means token expired
												// ex: we set exp time as 9:30 , current time is 9:28 means token not expired
	}

	public boolean isValidToken(String token,String userId) {
		
		// valid : True
		// invalid : false
		
		String userIdFromToken=getUserIdFromToken(token);
		System.out.println("User Id Retrived From Token :"+ userIdFromToken);
		return userIdFromToken.equalsIgnoreCase(userId) && isTokenExpired(token);
	
	}





}
