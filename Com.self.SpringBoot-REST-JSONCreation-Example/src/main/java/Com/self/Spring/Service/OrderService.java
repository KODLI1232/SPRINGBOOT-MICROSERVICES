package Com.self.Spring.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.Spring.Entity.DeliveryAddressEntity;
import Com.self.Spring.Entity.OrderDetailsEntity;
import Com.self.Spring.Entity.PaymentDetailsEntity;
import Com.self.Spring.Entity.ProductInformationEntity;
import Com.self.Spring.Repository.OrderRepository;
import Com.self.Spring.Request.OrderDetails;
import Com.self.Spring.Request.ProductInformation;
import Com.self.Spring.Response.OrderDetailsResponse;


@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	public String createOrder(OrderDetails orderDetails) {
		
		System.out.println("Data in service layer : map from DTo to Entity");
		
		// todo
		
		OrderDetailsEntity orderDetailsEntity=new OrderDetailsEntity();
		orderDetailsEntity.setFullName(orderDetails.getFullName());
		orderDetailsEntity.setEmailId(orderDetails.getEmailId());
		orderDetailsEntity.setMobileNumber(orderDetails.getMobileNumber());
		orderDetailsEntity.setTotalAmount(orderDetails.getTotalAmount());
		
		
		DeliveryAddressEntity deliveryAddress=new DeliveryAddressEntity();
		
		deliveryAddress.setBuildingName(orderDetails.getDeliveryAddress().getBuildingName());
		deliveryAddress.setStreetName(orderDetails.getDeliveryAddress().getStreetName());
		deliveryAddress.setFlatNumber(orderDetails.getDeliveryAddress().getFlatNumber());
		deliveryAddress.setPincode(orderDetails.getDeliveryAddress().getPincode());
		deliveryAddress.setState(orderDetails.getDeliveryAddress().getState());
		deliveryAddress.setCity(orderDetails.getDeliveryAddress().getCity());
		
		orderDetailsEntity.setDeliveryAddress(deliveryAddress);
		
		PaymentDetailsEntity paymentDetails=new PaymentDetailsEntity();
		
		paymentDetails.setBankTransactionId(orderDetails.getPaymentDetails().getBankTransactionId());
		paymentDetails.setPaidAmount(orderDetails.getPaymentDetails().getPaidAmount());
		paymentDetails.setPaymentstatus(orderDetails.getPaymentDetails().getPaymentstatus());
		
		orderDetailsEntity.setPaymentDetails(paymentDetails);
		
		// product info
		
		List<ProductInformationEntity> allProductsInfo= orderDetails
													.getProductInformation()
													.stream()
													.map(product-> new ProductInformationEntity(product.getProductId(),
																						 	product.getProductName(),
																							product.getPrice(),
																							product.getQuantity(),
																							product.getSpecifications())).toList();
		orderDetailsEntity.setProductInformation(allProductsInfo);
		
		
		// call repository
		
		orderRepository.save(orderDetailsEntity);
		
		
		return "orderCreated Succesfully";
		
		
	}

/*	public List<OrderDetailsResponse> loadAllProducts() {
		
	List<OrderDetailsEntity> allProducts	=orderRepository.findAll();
	
	// List doesn;t have getFullName()
	// So we need to loop through list convert EACH entity to a response DTO.
	List<OrderDetailsResponse> responseList = new ArrayList<>();

	// Mapping from Entity to response DTO classes
	for(OrderDetailsEntity entity:allProducts) {
		
	OrderDetailsResponse orderDetailsResponse=new OrderDetailsResponse();

	orderDetailsResponse.setFullName(entity.getFullName());
	orderDetailsResponse.setEmailId(entity.getEmailId());
	orderDetailsResponse.setMobileNumber(entity.getMobileNumber());
    orderDetailsResponse.setTotalAmount(entity.getTotalAmount());
	
    //  // PRODUCT INFORMATION LIST MAPPING
    
    List<ProductInformation> productList = entity.getProductInformation()
            .stream()
            .map(p -> {
                ProductInformation product = new ProductInformation();
                product.setProductName(p.getProductName());
                product.setPrice(p.getPrice());
                product.setQuantity(p.getQuantity());
                return product;
            })
            .toList();
    orderDetailsResponse.setProductInformation(productList);
	}
	return responseList;
	}*/
	
	public List<OrderDetailsEntity> loadAllProducts(){
		
		List<OrderDetailsEntity> allProducts	=orderRepository.findAll();
		
		return allProducts;
		
	}

}
