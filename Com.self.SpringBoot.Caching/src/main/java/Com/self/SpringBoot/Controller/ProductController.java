package Com.self.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Entity.ProductEntity;
import Com.self.SpringBoot.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/add")
	public ProductEntity add(@RequestBody ProductEntity productEntity) {
		return productService.addProduct(productEntity);
	}
	
	@GetMapping("/getproducts/{id}")
	public ProductEntity getProduct(@PathVariable Long id) {
		 return productService.getProductById(id);
	}
	
	@PutMapping("/updateproduct")
	public ProductEntity update(@RequestBody ProductEntity productEntity ) {
		return productService.updateProduct(productEntity);
}
	@DeleteMapping("/deleteproduct/{id}")
	public String delete(@PathVariable Long id) {
		productService.deleteProduct(id);
		return "Product Deleted Successfully";
	}
}