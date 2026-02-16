package Com.self.Spring.Request;

import java.util.List;

public class OrderDetails {

	private String fullName;
	private String emailId;
	private int mobileNumber;
	private int totalAmount;
	
	// Product Information : List
	private List<ProductInformation> productInformation;
	
	// Addrees
	private DeliveryAddress deliveryAddress;
	
	// payment details
	private PaymentDetails paymentDetails;

	public OrderDetails() {
		
		
	}

	public OrderDetails(String fullName, String emailId, int mobileNumber, int totalAmount,
			List<ProductInformation> productInformation, DeliveryAddress deliveryAddress,
			PaymentDetails paymentDetails) {
		
		this.fullName = fullName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.totalAmount = totalAmount;
		this.productInformation = productInformation;
		this.deliveryAddress = deliveryAddress;
		this.paymentDetails = paymentDetails;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<ProductInformation> getProductInformation() {
		return productInformation;
	}

	public void setProductInformation(List<ProductInformation> productInformation) {
		this.productInformation = productInformation;
	}

	public DeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	@Override
	public String toString() {
		return "OrderDetails [fullName=" + fullName + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ ", totalAmount=" + totalAmount + ", productInformation=" + productInformation + ", deliveryAddress="
				+ deliveryAddress + ", paymentDetails=" + paymentDetails + "]";
	}
	
	
	
}
