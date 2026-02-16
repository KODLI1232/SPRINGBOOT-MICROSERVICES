package Com.Swiggy.food.delivery;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int productId;
	private String name;
	private double price;
	
	public Product() {
		System.out.println("Product created");
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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
	
	
	
	
}
