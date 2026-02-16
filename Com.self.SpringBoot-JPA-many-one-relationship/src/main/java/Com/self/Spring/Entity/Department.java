package Com.self.Spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dept_MtoO")
public class Department {

	@Id
	private int deptId;
	private String deptname;
	
	public Department() {
		
	}

	public Department(int deptId, String deptname) {
	
		this.deptId = deptId;
		this.deptname = deptname;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptname=" + deptname + "]";
	}
	
}
