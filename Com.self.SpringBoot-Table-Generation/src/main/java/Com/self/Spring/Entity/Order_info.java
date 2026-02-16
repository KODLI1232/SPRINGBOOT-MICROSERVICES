package Com.self.Spring.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
// @Table(name="order_info")  // even iofwe dont give this it automatically takes the table name
public class Order_info {
	
	@Id
	@Column(name="order_id")
	private long orderId;
	@Column(name="email")
	private String  emailId;
	private int noOfItems;
	private String name;
	private String country;
	private String city;
	private int pinCode;
	private int amount;
	
	public Order_info() {

	}

	public Order_info(long orderId, String emailId, int noOfItems, String name, String country, String city,
			int pinCode, int amount) {
		this.orderId = orderId;
		this.emailId = emailId;
		this.noOfItems = noOfItems;
		this.name = name;
		this.country = country;
		this.city = city;
		this.pinCode = pinCode;
		this.amount = amount;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
	
}
