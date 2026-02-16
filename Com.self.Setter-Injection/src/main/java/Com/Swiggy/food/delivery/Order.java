package Com.Swiggy.food.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

	private int noOfProducts;
	private String emailId;
	
	// @Autowired   // This is Field Injection
	private Product product;
	
	
	public Order() {
		System.out.println("Order created");
	}


	public int getNoOfProducts() {
		return noOfProducts;
	}


	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public Product getProduct() {
		return product;
	}

	@Autowired  // This is Setter Injection at setter method
	public void setProduct(Product product) {
		this.product = product;
	}
}
