package Com.self.Spring.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Json_productinfo_Example")
public class ProductInformationEntity {

	@Id
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private List<String> specifications;
	
	public ProductInformationEntity() {
		
	}

	public ProductInformationEntity(int productId, String productName, double price, int quantity,
			List<String> specifications) {
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.specifications = specifications;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<String> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(List<String> specifications) {
		this.specifications = specifications;
	}

	@Override
	public String toString() {
		return "ProductInformation [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + ", specifications=" + specifications + "]";
	}
	
	
	
}
