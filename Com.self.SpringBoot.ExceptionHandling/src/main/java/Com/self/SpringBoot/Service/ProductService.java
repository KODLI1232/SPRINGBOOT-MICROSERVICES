package Com.self.SpringBoot.Service;

import org.springframework.stereotype.Service;

import Com.self.SpringBoot.Request.ProductDetails;

@Service
public class ProductService {


	
	public String addProduct(ProductDetails productDetails) throws ClassNotFoundException {
		
//		int value=0;
//		
//		double price=productDetails.getPrice()/value;	
//	System.out.println("Product price"+price);
		
	//	String value=null;
		
	//	System.out.println(value.toLowerCase());
		
		Class.forName("KSK");
		
		return "added succesfull";
	}

}
