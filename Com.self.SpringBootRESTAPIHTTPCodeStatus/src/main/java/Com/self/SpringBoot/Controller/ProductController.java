package Com.self.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Request.ProductRequest;
import Com.self.SpringBoot.Service.ProductService;
import jakarta.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

//    @PostMapping("/product/add")
//    public String addProduct(@Valid @RequestBody ProductRequest productRequest) {
//        return productService.addProduct(productRequest);
//    }
    
    @PostMapping("/product/create/product")
    public ResponseEntity<String> addProduct(@RequestBody ProductRequest productRequest){
    	String msgString=productService.addProduct(productRequest);
		
    	// Body Level
    	// body+StatusCodes
    	
    	if(msgString.equalsIgnoreCase("Created")) {
    		
    		return new 	ResponseEntity<String>(msgString,HttpStatusCode.valueOf(201));
    	}
    	else {
    		return new	ResponseEntity<String>(msgString,HttpStatusCode.valueOf(200));  //defalut
    	}
   
    }
}
