package Com.self.Spring.RequestClass;

import lombok.Data;

//We mention the RequestBody class in the controller method so
//that Spring knows the shape of the incoming JSON and 
//can automatically convert the request body into a Java object using Jackson. 
//The @RequestBody annotation tells Spring to read data from the HTTP body instead of URL.

@Data
public class UserSignUpRequest {

	
	private String firstName;
	private String lastName;
	private int age;
	private String emailID;
	private String MobileNo;
	private String password;
	
	public UserSignUpRequest() {
		
	}

	public UserSignUpRequest(String firstName, String lastName, int age, String emailID, String mobileNo,
			String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.emailID = emailID;
		MobileNo = mobileNo;
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
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserSignUpRequest [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", emailID="
				+ emailID + ", MobileNo=" + MobileNo + ", password=" + password + "]";
	}
	
}
