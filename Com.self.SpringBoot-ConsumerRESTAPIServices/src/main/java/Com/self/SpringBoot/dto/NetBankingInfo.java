package Com.self.SpringBoot.dto;

public class NetBankingInfo {

	private String userName;
	private String password;
	private double amountTobePaid;
	
	public NetBankingInfo() {
		
	}

	public NetBankingInfo(String userName, String password, double amountTobePaid) {
		super();
		this.userName = userName;
		this.password = password;
		this.amountTobePaid = amountTobePaid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAmountTobePaid() {
		return amountTobePaid;
	}

	public void setAmountTobePaid(double amountTobePaid) {
		this.amountTobePaid = amountTobePaid;
	}
	
	
}
