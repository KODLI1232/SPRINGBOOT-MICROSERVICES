package Com.self.Spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_webAppl")
public class UserDetails {

	
	@Id
	private String emailId;
	private String password;
	private String fullName;
	
	
	public UserDetails() {
		
	}


	public UserDetails(String emailId, String password, String fullName) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.fullName = fullName;
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


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	@Override
	public String toString() {
		return "UserDetails [emailId=" + emailId + ", password=" + password + ", fullName=" + fullName + "]";
	}
	
	
	
	
}
