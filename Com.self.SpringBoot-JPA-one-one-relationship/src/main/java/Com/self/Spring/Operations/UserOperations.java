package Com.self.Spring.Operations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.self.Spring.Entity.Address;
import Com.self.Spring.Entity.OrderDetails;
import Com.self.Spring.Entity.UserDetails;
import Com.self.Spring.Repository.OrderRepository;
import Com.self.Spring.Repository.UserRepository;
import jakarta.transaction.Transactional;

@Component
public class UserOperations {

	
	@Autowired
	UserRepository userRepository;
	OrderRepository orderRepository;
	
	//Add employee details
	
//	public void addUser() {
//		
//		System.out.println("Addong users");
//		
//		UserDetails userDetails=new UserDetails();
//		
//		userDetails.setUserId(123456);
//		userDetails.setName("ISHA");
//		userDetails.setGender("FEMALE");
		
		
		// address 1
		
     	Address address1=new Address();
//		address1.setCity("HYD");
//		address1.setPincode(509407);
//		address1.setCountry("INDIA");
//		
//		Address address2=new Address();
//		address2.setCity("BANG");
//		address2.setPincode(500001);
//		address2.setCountry("INDIA");
//		
//		Address address3=new Address();
//		address3.setCity("CHENNAI");
//		address3.setPincode(501011);
//		address3.setCountry("INDIA");
		
//		Address address1=new Address();
//		address1.setCity("HYD");
//		address1.setPincode(500007);
//		address1.setCountry("INDIA");
		
//		Address address2=new Address();
//    	address2.setAddressId(7);
//		address2.setCity("CHENNAI");
//		address2.setPincode(500007);
//		address2.setCountry("INDIA");
		
//		userDetails.setAddress(List.of(address1,address2,address3));
//		userDetails.setAddress(List.of(address1));
	//	userDetails.setAddress(List.of(address2));
	//	userRepository.save(userDetails);
		
//	}
	
	@Transactional
//	public void getUserByID() {
//		Optional<UserDetails> userDetails =Optional.of(userRepository.findById(56789).get());
//		System.out.println(userDetails);
//	}
//	
//	
//	public void deleteById() {
//		userRepository.deleteById(123456);
//	}
	
	public void addUserWithOrders() {

	    UserDetails user = new UserDetails();
	    user.setUserId(101);
	    user.setName("Shiva");
	    user.setGender("Male");
	    
	// create orders
	
	OrderDetails order1=new OrderDetails();
	order1.setOrderId(1);
	order1.setProductName("VIVO");
	order1.setQuantity(1);
	order1.setPrice(13000.11);
	
	OrderDetails order2=new OrderDetails();
	order2.setOrderId(2);
	order2.setProductName("IQOO");
	order2.setQuantity(1);
	order2.setPrice(25069.19);
	
	OrderDetails order3=new OrderDetails();
	order3.setOrderId(3);
	order3.setProductName("MOTO");
	order3.setQuantity(1);
	order3.setPrice(15069.69);
	
	user.setOrders(List.of(order1,order2,order3));
	
	userRepository.save(user);
	}
	

}
