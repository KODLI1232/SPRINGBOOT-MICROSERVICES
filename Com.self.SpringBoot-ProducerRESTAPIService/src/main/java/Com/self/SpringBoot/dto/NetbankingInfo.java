package Com.self.SpringBoot.dto;


public class NetbankingInfo {

	private String userName;
	private String password;
	private int amountTobePaid;
	
	public NetbankingInfo() {
		
	}

	public NetbankingInfo(String userName, String password, int amountTobePaid) {

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

	public int getAmountTobePaid() {
		return amountTobePaid;
	}

	public void setAmountTobePaid(int amountTobePaid) {
		this.amountTobePaid = amountTobePaid;
	}

	@Override
	public String toString() {
		return "NetbankingInfo [userName=" + userName + ", password=" + password + ", amountTobePaid=" + amountTobePaid
				+ "]";
	}

	
	
	
}
