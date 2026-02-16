package Com.self.DIFieldInjection;

import org.springframework.stereotype.Component;

//@Component
public class Address {
	
	private int pincode;
	private String city;
	
	public Address() {
		System.out.println("Object created");
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
