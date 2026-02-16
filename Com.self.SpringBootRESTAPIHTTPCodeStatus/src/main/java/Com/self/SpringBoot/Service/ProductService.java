package Com.self.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.SpringBoot.Entity.ProductDetails;
import Com.self.SpringBoot.Repository.ProductRepository;
import Com.self.SpringBoot.Request.ProductRequest;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public String addProduct(ProductRequest productRequest) {

        ProductDetails productDetails = new ProductDetails();

        productDetails.setProductName(productRequest.getProductName());
        productDetails.setPrice(productRequest.getPrice());
        productDetails.setValidProduct(productRequest.isValidProduct());

        productRepository.save(productDetails);

        return "Product Created Successfully";
    }
}
