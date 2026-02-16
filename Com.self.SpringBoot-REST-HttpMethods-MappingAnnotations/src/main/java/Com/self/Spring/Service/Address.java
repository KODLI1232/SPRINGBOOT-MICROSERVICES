package Com.self.Spring.Service;

public class Address {

	private String area;
	private String flat;
	private String city;
	private int pincode;
	private String state;
	private String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String area, String flat, String city, int pincode, String state, String country) {
		super();
		this.area = area;
		this.flat = flat;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getFlat() {
		return flat;
	}

	public void setFlat(String flat) {
		this.flat = flat;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", flat=" + flat + ", city=" + city + ", pincode=" + pincode + ", state="
				+ state + ", country=" + country + "]";
	}
	
	
}
