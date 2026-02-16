package Com.self.Component;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	private String nameString;
	private int id;
	private double price;
	
	public Product() {
		System.out.println("Product created");
	}
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
