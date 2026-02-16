package Com.Swiggy.food.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDelivery {

	private String boyname;
	@Autowired
	private Order order;
	
	
	public String getBoyname() {
		return boyname;
	}
	public void setBoyname(String boyname) {
		this.boyname = boyname;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
