package Com.self.SpringBoot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_Table_HTTP_Status_Codes")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    private String productName;

    private double price;

    private Boolean validProduct;  // <-- clean field name

    public ProductDetails() {}

    public ProductDetails(Integer productId, String productName, double price, Boolean validProduct) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.validProduct = validProduct;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
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

    public Boolean getValidProduct() {
        return validProduct;
    }

    public void setValidProduct(Boolean validProduct) {
        this.validProduct = validProduct;
    }
}
