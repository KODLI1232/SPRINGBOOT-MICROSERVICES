package Com.self.Spring.Response;



public class UserDetailsResponse {

	private String firstName;
	private String lastName;
	private int age;
	private String emailID;
	private String mobileNo;
	
	
	public UserDetailsResponse() {
	
	}

	public UserDetailsResponse(String firstName, String lastName, int age, String emailID, String mobileNo) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.emailID = emailID;
		this.mobileNo = mobileNo;
		
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



	@Override
	public String toString() {
		return "UserDetailsResponse [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", emailID="
				+ emailID + ", mobileNo=" + mobileNo + "]";
	}
	
	
}
