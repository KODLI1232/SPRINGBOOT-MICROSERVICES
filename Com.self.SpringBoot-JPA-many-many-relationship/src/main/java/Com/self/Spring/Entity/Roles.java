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
@Table(name = "role_MtoM")
public class Roles {
	
	
	@Id
	private int rollId;
	
	private String roleName;

	public Roles() {
		
	}

	public Roles(int rollId, String roleName) {
		
		this.rollId = rollId;
		this.roleName = roleName;
	}

	public int getRollId() {
		return rollId;
	}

	public void setRollId(int rollId) {
		this.rollId = rollId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Roles [rollId=" + rollId + ", roleName=" + roleName + "]";
	}
}
