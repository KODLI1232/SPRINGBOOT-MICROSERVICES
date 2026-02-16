package Com.self.Spring.Request;

public class UserRequest {
	
	
	private Integer userId;
	private String name;
	private String emailId;
	private String password;
	private String mobile;
	private String city;
	private String state;
	private String country;
	private String gender;
	private String qualiifcation;
	
	public UserRequest() {
		
	}

	public UserRequest(String name, String emailId, String password, String mobile, String city, String state,
			String country, String gender, String qualiifcation,Integer userId) {
		
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
		this.country = country;
		this.gender = gender;
		this.qualiifcation = qualiifcation;
		this.userId=userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualiifcation() {
		return qualiifcation;
	}

	public void setQualiifcation(String qualiifcation) {
		this.qualiifcation = qualiifcation;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserRequest [userId=" + userId + ", name=" + name + ", emailId=" + emailId + ", password=" + password
				+ ", mobile=" + mobile + ", city=" + city + ", state=" + state + ", country=" + country + ", gender="
				+ gender + ", qualiifcation=" + qualiifcation + "]";
	}

	
	
	
	

}
