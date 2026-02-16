package Com.self.Spring.ValueAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	//@Value("1501")       // hardcoded values
	@Value("${order.id}")
	private int productId;
	@Value("${order.name}")
	private String productName;
	@Value("${order.delivery.charge}")
	private int deliveryCharge;
	
	@Value("${spring.application.name}")
	private String appName;
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	@Autowired
	private DeliverySevice deliverySevice;
	
	
	public DeliverySevice getDeliverySevice() {
		return deliverySevice;
	}

	public void setDeliverySevice(DeliverySevice deliverySevice) {
		this.deliverySevice = deliverySevice;
	}

	public OrderService() {
		System.out.println("OrderService created");
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(int deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
}
