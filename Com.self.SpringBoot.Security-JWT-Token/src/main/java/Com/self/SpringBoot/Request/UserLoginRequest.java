package Com.self.SpringBoot.Request;

public class UserLoginRequest {
	
	private String emailId;
	private String password;
	
	public UserLoginRequest() {
		
	}

	public UserLoginRequest( String password, String emailId) {
		
		
		this.password = password;
		this.emailId=emailId;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "UserLoginRequest [emailId=" + emailId + ", , password=" + password
				+ "]";
	}

	
	
	

}
