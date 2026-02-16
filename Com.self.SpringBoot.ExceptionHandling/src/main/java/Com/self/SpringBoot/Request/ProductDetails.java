package Com.self.SpringBoot.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ProductDetails {

	
	@NotBlank(message = "Should not be blank")
	//@NotNull(message = "should not be null")
	@NotEmpty(message = "should not be Empty")
	private String pid;
	
	@NotBlank(message = "Should not be blank")
	//@NotNull(message = "should not be null")
	//@NotEmpty(message = "should not be Empty")
	private String name;
	
	@NotBlank(message = "Should not be blank")
//	@NotNull(message = "should not be null")
    @NotEmpty(message = "should not be Empty")
	private String price;

	public ProductDetails() {
		
	}

	public ProductDetails(
			@NotBlank(message = "Should not be blank") @NotEmpty(message = "Should not be blank") String pid,
			@NotBlank(message = "Should not be blank") @NotEmpty(message = "Should not be blank")  String name,
			@NotBlank(message = "Should not be blank") @NotEmpty(message = "Should not be blank") String price) {
	
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDetails [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
