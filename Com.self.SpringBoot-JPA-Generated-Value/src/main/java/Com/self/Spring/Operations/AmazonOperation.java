package Com.self.Spring.Operations;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.self.Spring.Entity.AmazonOrder;
import Com.self.Spring.Repository.AmazonRepository;

@Component
public class AmazonOperation {
	
	@Autowired
	AmazonRepository amazonRepository;
	
	public void createOrder() {
		AmazonOrder amazonOrder=new AmazonOrder();
		
		amazonOrder.setEmailId("Dsk@gmail.com");
		amazonOrder.setName("DSK");
		amazonOrder.setPrice(69.69);
		amazonOrder.setTimeOrder(LocalDateTime.now());
		
	AmazonOrder creAmazonOrder=	amazonRepository.save(amazonOrder);
	System.out.println("Ordergenerated");
	System.out.println(creAmazonOrder.getOrderId());
	
	}

}
