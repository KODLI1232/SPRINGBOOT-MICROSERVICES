package Com.self.Spring.Request;


public class PaymentDetails {

	private double paidAmount;
	private String paymentstatus;
	private double bankTransactionId;
	
	public PaymentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentDetails(double paidAmount, String paymentstatus, double bankTransactionId) {
		super();
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

	@Override
	public String toString() {
		return "PaymentDetails [paidAmount=" + paidAmount + ", paymentstatus=" + paymentstatus + ", bankTransactionId="
				+ bankTransactionId + "]";
	}
	
	
}
