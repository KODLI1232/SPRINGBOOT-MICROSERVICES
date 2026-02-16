package Com.self.Spring.Response;

import java.util.List;

import Com.self.Spring.Entity.PaymentDetailsEntity;
import Com.self.Spring.Request.DeliveryAddress;
import Com.self.Spring.Request.ProductInformation;

public class OrderDetailsResponse {
	
	private String fullName;
	private String emailId;
	private int mobileNumber;
	private int totalAmount;
	
	// Product Information : List
	private List<ProductInformation> productInformation;
	
	// Addrees
	private DeliveryAddress deliveryAddress;
	
	// payment details
	private PaymentDetailsEntity paymentDetails;

	public OrderDetailsResponse() {

	}

	public OrderDetailsResponse(String fullName, String emailId, int mobileNumber, int totalAmount,
			List<ProductInformation> productInformation, DeliveryAddress deliveryAddress,
			PaymentDetailsEntity paymentDetails) {
		
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

	public PaymentDetailsEntity getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetailsEntity pay) {
		this.paymentDetails = pay;
	}

	@Override
	public String toString() {
		return "OrderDetailsResponse [fullName=" + fullName + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ ", totalAmount=" + totalAmount + ", productInformation=" + productInformation + ", deliveryAddress="
				+ deliveryAddress + ", paymentDetails=" + paymentDetails + "]";
	}
	
	
	

}
