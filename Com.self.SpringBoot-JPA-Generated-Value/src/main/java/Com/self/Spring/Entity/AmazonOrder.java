package Com.self.Spring.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class AmazonOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String orderId;
	private String emailId;
	private String name;
	private double price;
	private LocalDateTime timeOrder;
	
	public AmazonOrder() {
		
	}

	public AmazonOrder(String orderId, String emailId, String name, double price, LocalDateTime timeOrder) {
	
		this.orderId = orderId;
		this.emailId = emailId;
		this.name = name;
		this.price = price;
		this.timeOrder = timeOrder;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getTimeOrder() {
		return timeOrder;
	}

	public void setTimeOrder(LocalDateTime timeOrder) {
		this.timeOrder = timeOrder;
	}
}
