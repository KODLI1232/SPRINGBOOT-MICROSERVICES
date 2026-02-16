package Com.self.Spring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="staff")
public class Staff {
	
	public Staff() {
		
	}

	public Staff(int employeeId, String name, int age, double salary, String country, String city, String gender) {
		EmployeeId = employeeId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.country = country;
		this.city = city;
		this.gender = gender;
	}

	@Id
	@Column(name="emp_id")
	private int EmployeeId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")  // even if dont give @Column here, springboot takes it has like both table column and property is same
	private int age;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="country")
	private String country;
	
	@Column
	private String city;

	@Column
	private String gender;

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	@Override
	public String toString() {
		return "Staff [EmployeeId=" + EmployeeId + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ ", country=" + country + ", city=" + city + ", gender=" + gender + "]";
	}

	

}
