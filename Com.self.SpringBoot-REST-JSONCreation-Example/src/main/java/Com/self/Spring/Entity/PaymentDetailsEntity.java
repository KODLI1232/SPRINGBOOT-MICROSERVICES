package Com.self.Spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Json_payment_Example")
public class PaymentDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private double paidAmount;
	private String paymentstatus;
	private double bankTransactionId;
	
	public PaymentDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentDetailsEntity(double paidAmount, String paymentstatus, double bankTransactionId, int paymentId) {
		super();
		this.paymentId=paymentId;
		this.paidAmount = paidAmount;
		this.paymentstatus = paymentstatus;
		this.bankTransactionId = bankTransactionId;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public double getBankTransactionId() {
		return bankTransactionId;
	}

	public void setBankTransactionId(double bankTransactionId) {
		this.bankTransactionId = bankTransactionId;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	@Override
	public String toString() {
		return "PaymentDetails [paymentId=" + paymentId + ", paidAmount=" + paidAmount + ", paymentstatus="
				+ paymentstatus + ", bankTransactionId=" + bankTransactionId + "]";
	}
	
	
	
}
