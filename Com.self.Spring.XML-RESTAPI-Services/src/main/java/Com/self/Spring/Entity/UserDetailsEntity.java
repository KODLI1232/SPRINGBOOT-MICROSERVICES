package Com.self.Spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "XMLUSERS_TABLE")
public class UserDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String name;
	private String mobileNumber;
	private int age;
	private String city;
	private String gender;
	private String qualification;
	private String country;
	
	
	public UserDetailsEntity() {
		
	}


	public UserDetailsEntity(String name, String mobileNumber, int age, String city, String gender, String qualification,
			String country,int userid) {
	
		this.userid=userid;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.city = city;
		this.gender = gender;
		this.qualification = qualification;
		this.country = country;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	@Override
	public String toString() {
		return "UserDetailsEntity [userid=" + userid + ", name=" + name + ", mobileNumber=" + mobileNumber + ", age="
				+ age + ", city=" + city + ", gender=" + gender + ", qualification=" + qualification + ", country="
				+ country + "]";
	}
	
	


	

}
