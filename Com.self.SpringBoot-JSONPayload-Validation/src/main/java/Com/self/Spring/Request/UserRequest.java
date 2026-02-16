package Com.self.Spring.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserRequest {

	@NotNull
	@NotBlank
	@Size(min=5,message = "please enter 5 characters")
	private String fullName;
	private String lastName;
	private String emailId;
	
	@NotBlank(message = "Password is required")
    @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
    @Pattern(
        regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&]).+$",
        message = "Password must contain uppercase, lowercase, number, and special character"
    )
	private String password;
	
	
	@Pattern(regexp = "^(\\+91[- ]?)?[6-9]\\d{9}$", 
    message = "Invalid Indian mobile number")
	private long mobileNumber;
	private String address;
	private long pincode;
	
	public UserRequest() {
		
	}
	
	public UserRequest(String fullName, String lastName, String emailId, String password, long mobileNumber,
			String address, long pincode) {
	
		this.fullName = fullName;
		this.lastName = lastName;
		this.emailId = emailId;
		
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.pincode = pincode;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "UserRequest [fullName=" + fullName + ", lastName=" + lastName + ", emailId=" + emailId + ", password="
				+ password + ", mobileNumber=" + mobileNumber + ", address=" + address + ", pincode=" + pincode + "]";
	}
	
}
