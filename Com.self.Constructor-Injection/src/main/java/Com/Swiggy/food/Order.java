package Com.Swiggy.food;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {

	private int noOfProducts;
	private String emailId;
	private Product product;
	
	//CI: product object : Defined constructor with 1 parameter
	// bean id's: product,productTwo  DI:success because different bean ids
	// bean id's: product,productTwo,constructor arg:productThree , DI:fails because different bean id not found
	//@Autowired
	public Order(@Qualifier("productTwo") Product productThree) {
		System.out.println("Order created 1 param"+productThree);
		this.product=productThree;
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

	
	public void setProduct(Product product) {
		this.product = product;
	}
}
