package Com.self.Spring.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_table")
public class UserDetails {

	@Id
	private int userId;

	private String name;
	
	private String gender;

	public UserDetails() {
		
	}
	
	public UserDetails(int userId, String name, String gender, List<Address> address) {
		
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.addresses = address;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public List<Address> getAddress() {
		return addresses;
	}

	public void setAddress(List<Address> address) {
		this.addresses = address;
	}
	
	

	//Defining relationship
		//Entity class of Adresss table
	
	
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", name=" + name + ", gender=" + gender + ", address=" + addresses + "]";
	}

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="user_id_add_id")
	List<Address> addresses;   // to get 1-> many relation we used List
	                           // now UserDetails become composite class
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id_order_id")
	List<OrderDetails> orderDetails;

	public void setOrders(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
		
	}

}
