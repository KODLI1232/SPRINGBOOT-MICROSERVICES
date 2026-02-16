package Com.self.Spring.Request;


public class UserInfoRequest {

	private String firstName;
	private String lastName;
	private int age;
	private String emailID;
	private String mobileNo;
	private String password;
	
	public UserInfoRequest() {
		
	}

	public UserInfoRequest(String firstName, String lastName, int age, String emailID, String mobileNo,
			String password) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.emailID = emailID;
		this.mobileNo = mobileNo;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserInfoRequest [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", emailID="
				+ emailID + ", MobileNo=" + mobileNo + ", password=" + password + "]";
	}
	
	
	
}
