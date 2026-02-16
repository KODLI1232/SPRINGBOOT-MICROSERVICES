package Com.self.Spring.Operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.self.Spring.Entity.Order_info;
import Com.self.Spring.Repository.OrderInfoRepository;

@Component
public class OrderOperations {

	@Autowired
	public OrderInfoRepository orderInfoRepository;
	
//	public void addOrder() {
//		Order_info order_info =new Order_info();
//	    order_info.setOrderId(1);
//	}
	
	public void loadall() {
		List<Order_info> allInfos=orderInfoRepository.findAll();
		allInfos.forEach(System.out::println);
	}
}
