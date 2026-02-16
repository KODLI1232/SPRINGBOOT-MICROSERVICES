package Com.self.SpringBoot.Dtos;

public class StudentLoginDto {
	

	private String emailId;
	private String password;
	
	public StudentLoginDto() {
		
	}

	public StudentLoginDto( String emailId,  String password) {
		
		this.emailId = emailId;
		this.password = password;
		
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPasswword(String password) {
		this.password = password;
	}

}
