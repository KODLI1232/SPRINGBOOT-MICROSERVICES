package Com.self.Spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Json_address_Example")
public class DeliveryAddressEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String streetName;
	private String buildingName;
	private String flatNumber;
	private String city;
	private String state;
	private int pincode;
	
	public DeliveryAddressEntity() {
		
	}

	public DeliveryAddressEntity(String streetName, String buildingName, String flatNumber, String city, String state,
			int pincode, int addressId) {
		
		this.addressId=addressId;
		this.streetName = streetName;
		this.buildingName = buildingName;
		this.flatNumber = flatNumber;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "DeliveryAddress [addressId=" + addressId + ", streetName=" + streetName + ", buildingName="
				+ buildingName + ", flatNumber=" + flatNumber + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	
	
}
