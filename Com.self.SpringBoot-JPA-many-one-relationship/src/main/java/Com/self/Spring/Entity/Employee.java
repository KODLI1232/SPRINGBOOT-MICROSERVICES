package Com.self.Spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emp_MtoO")
public class Employee {
	
	@Id
	private int empid;
	private String name;
	private String gender;
	
	public Employee() {
	
	}

	public Employee(int empid, String name, String gender, Department dept1) {
		
		this.empid = empid;
		this.name = name;
		this.gender = gender;
		this.department=dept1;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", gender=" + gender + "]";
	}
	
	// many to one
	
	@ManyToOne
	Department department;   // injecting department into this class
}
