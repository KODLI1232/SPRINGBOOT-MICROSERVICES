package Com.self.SpringBoot.Controller;

import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Request.ProductDetails;
import Com.self.SpringBoot.Service.ProductService;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/add/product")
	public String addProduct( @Valid @RequestBody ProductDetails productDetails) throws ClassNotFoundException {
		//TODO: process POST request
		
		return productService.addProduct(productDetails);
	}
	
}
