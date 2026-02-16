package Com.self.Spring.ValueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emailCredentials")
public class EmailCredentialConfiguration {
	// SI
	//@Value("${app.email.Host}")
	private String emailHost;
	
	// CI
	//@Value("${app.email.User}")
	private String emailId;
	
	@Value("${app.email.Password}")
	private String emailPassword;

	public EmailCredentialConfiguration() {

	}
	// Constructor 1 para
	public EmailCredentialConfiguration( @Value("${app.email.User}")String emailId) {
		System.out.println("1 para constructor"+emailId);
		this.emailId = emailId;
	}

	public String getEmailHost() {
		return emailHost;
	}
	@Value("${app.email.Host}")
	public void setEmailHost( String emailHost) {
		System.out.println("Email Host called at setter method"+emailHost);
		this.emailHost = emailHost;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmailPassword() {
		return emailPassword;
	}
	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}
	
	
}
