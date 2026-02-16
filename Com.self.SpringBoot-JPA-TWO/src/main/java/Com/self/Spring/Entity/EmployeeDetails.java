package Com.self.Spring.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // create getters and setters
@AllArgsConstructor // creates constructor with fields
@NoArgsConstructor  // creates defalut constructor
@Entity
@Table(name="EMPDETAILS")
public class EmployeeDetails {
	
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
	
	public EmployeeDetails() {
		
	}
	
	public EmployeeDetails(int employeeId, String name, int age, double salary,String country) {
		
		EmployeeId = employeeId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.country = country;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [EmployeeId=" + EmployeeId + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ ", country=" + country + "]";
	}
	
	
	
}
