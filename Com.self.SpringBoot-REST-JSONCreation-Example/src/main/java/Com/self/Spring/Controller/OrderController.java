package Com.self.Spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.Spring.Entity.OrderDetailsEntity;
import Com.self.Spring.Request.OrderDetails;
import Com.self.Spring.Service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	 private OrderService orderService;
	

	@PostMapping("/create/order")
	public String createOrder(@RequestBody OrderDetails orderDetails) {
		
	String result=	orderService.createOrder(orderDetails);
		
		return result;
	}
	
	@GetMapping("/load/allproducts")
	public List<OrderDetailsEntity> loadAllProducts(){
		
		return 	orderService.loadAllProducts();
		
	}
	
}
