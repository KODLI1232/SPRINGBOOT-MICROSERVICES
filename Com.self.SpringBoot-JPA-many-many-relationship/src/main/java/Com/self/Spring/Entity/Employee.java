package Com.self.Spring.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emp_MtoM")
public class Employee {
	
	@Id
	private int empid;
	private String name;
	private String gender;
	
	public Employee() {
	
	}

	public Employee(int empid, String name, String gender, List<Roles> list) {
		
		this.empid = empid;
		this.name = name;
		this.gender = gender;
		this.roles=list;
		
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
	
	// many to MAny
	
	@ManyToMany
	@JoinTable(name = "emp_roles_joining",
				joinColumns=@JoinColumn(name = "emp_id"),
				inverseJoinColumns=@JoinColumn(name="role_id"))
	
	List<Roles> roles;
	   // injecting department into this class
}
