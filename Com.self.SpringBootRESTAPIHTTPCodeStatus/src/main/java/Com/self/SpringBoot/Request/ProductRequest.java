package Com.self.SpringBoot.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductRequest {

	private Integer productId;
	@NotNull
	@NotBlank
    private String productName;
	
    private double price;
    private boolean validProduct;

    public ProductRequest() {}

    public ProductRequest(String productName, double price, boolean validProduct, Integer productId) {
        this.productName = productName;
        this.price = price;
        this.validProduct = validProduct;
        this.productId=productId;
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

    public boolean isValidProduct() {
        return validProduct;
    }

    public void setValidProduct(boolean validProduct) {
        this.validProduct = validProduct;
    }

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
}
