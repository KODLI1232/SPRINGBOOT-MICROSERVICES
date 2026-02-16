package Com.self.Spring.Request;

public class UserLoginRequest {
	
	private String emailID;
	private String password;
	
	public UserLoginRequest() {
		// defalut constructor
	}

	public UserLoginRequest(String emailID, String password) {
		
		this.emailID = emailID;
		this.password = password;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserLoginRequest [emailID=" + emailID + ", password=" + password + "]";
	}
	
	
	
	
	

}
