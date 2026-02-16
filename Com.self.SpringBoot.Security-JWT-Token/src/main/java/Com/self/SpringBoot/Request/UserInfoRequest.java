package Com.self.SpringBoot.Request;



public class UserInfoRequest {

		private String emailId;
		private String password;
		private Integer mobileNumber;
		private String fullName;
		
		public UserInfoRequest() {
			
		}

		public UserInfoRequest(String emailId, String password, Integer mobileNumber, String fullName) {
			
			this.emailId = emailId;
			this.password = password;
			this.mobileNumber = mobileNumber;
			this.fullName = fullName;
			
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Integer getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(Integer mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		

		@Override
		public String toString() {
			return "UserInfoRequest [ emailId=" + emailId + ", password=" + password
					+ ", mobileNumber=" + mobileNumber + ", fullName=" + fullName + "]";
		}
		
		

}
