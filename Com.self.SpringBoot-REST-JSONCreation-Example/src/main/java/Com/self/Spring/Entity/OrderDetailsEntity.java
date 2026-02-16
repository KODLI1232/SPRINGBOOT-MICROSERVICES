package Com.self.Spring.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Json_Table_Example")
public class OrderDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private String fullName;
	private String emailId;
	private int mobileNumber;
	private int totalAmount;
	
	// Product Information : List
	@OneToMany(cascade = CascadeType.ALL)
	private List<ProductInformationEntity> productInformation;
	
	// Addrees
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(
			    name = "delivery_address_id",   // FK column created in order_details table
			    referencedColumnName = "addressId"  // PK column in DeliveryAddressEntity
			)
	private DeliveryAddressEntity deliveryAddress;
	
	// payment details
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "payment_id", referencedColumnName = "paymentId")
	private PaymentDetailsEntity paymentDetails;

	public OrderDetailsEntity() {
		
		
	}

	public OrderDetailsEntity(String fullName, String emailId, int mobileNumber, int totalAmount,
			List<ProductInformationEntity> productInformation, DeliveryAddressEntity deliveryAddress,
			PaymentDetailsEntity paymentDetails, int orderId) {
		this.orderId=orderId;
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

	public List<ProductInformationEntity> getProductInformation() {
		return productInformation;
	}

	public void setProductInformation(List<ProductInformationEntity> allProductsInfo) {
		this.productInformation = allProductsInfo;
	}

	public DeliveryAddressEntity getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(DeliveryAddressEntity deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public PaymentDetailsEntity getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetailsEntity paymentDetails) {
		this.paymentDetails = paymentDetails;
	}


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "OrderDetailsEntity [orderId=" + orderId + ", fullName=" + fullName + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", totalAmount=" + totalAmount + ", productInformation="
				+ productInformation + ", deliveryAddress=" + deliveryAddress + ", paymentDetails=" + paymentDetails
				+ "]";
	}

	
	

}
