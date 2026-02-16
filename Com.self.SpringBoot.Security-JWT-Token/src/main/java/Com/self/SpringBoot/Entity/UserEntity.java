package Com.self.SpringBoot.Entity;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Insta_User_Info")
public class UserEntity implements UserDetails {
	
	
	@Id
	private String emailId;
	private String password;
	private Integer mobileNumber;
	private String fullName;
	
	public UserEntity() {
		
	}

	public UserEntity(String emailId, String password, Integer mobileNumber, String fullName) {
		
		this.emailId = emailId;
		this.password = password;
		this.mobileNumber = mobileNumber;
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

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setUserName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "UserEntity [emailId=" + emailId + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ ", fullName=" + fullName + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		

		return Collections.emptyList();
	}
// important method - which property is hav eto take as userId
//	Returns the username used to authenticate the user. Cannot return null.
	
	@Override
	public String getUsername() {
		
		
		
		
		return emailId;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
