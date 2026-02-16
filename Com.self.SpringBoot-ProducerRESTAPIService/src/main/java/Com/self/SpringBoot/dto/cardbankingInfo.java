package Com.self.SpringBoot.dto;

public class cardbankingInfo {

	
	private long cardNumber;
	private int cvv;
	private String expMonthYear;
	private double amountTobePaid;
	
	public cardbankingInfo() {
		
	}

	public cardbankingInfo(long cardNumber, int cvv, String expMonthYear, double amountTobePaid) {
		
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expMonthYear = expMonthYear;
		this.amountTobePaid = amountTobePaid;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getExpMonthYear() {
		return expMonthYear;
	}

	public void setExpMonthYear(String expMonthYear) {
		this.expMonthYear = expMonthYear;
	}

	public double getAmountTobePaid() {
		return amountTobePaid;
	}

	public void setAmountTobePaid(double amountTobePaid) {
		this.amountTobePaid = amountTobePaid;
	}
	
	
	
	
}
