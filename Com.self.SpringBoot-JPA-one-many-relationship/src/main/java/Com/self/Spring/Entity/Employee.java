package Com.self.Spring.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emp_table")
public class Employee {

	@Id
	@SequenceGenerator(name = "emp_id_seq",sequenceName = "emp_id_seq",initialValue = 1000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="emp_id_seq")
	private int empId;

	private String name;
	
	private String gender;

	public Employee() {
		
	}
	
	public Employee(int empId, String name, String gender, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

	//Defining relationship
		//Entity class of Adresss table
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}



	@OneToOne(cascade = CascadeType.ALL)
	Address address;   // now employee become composite class


}
