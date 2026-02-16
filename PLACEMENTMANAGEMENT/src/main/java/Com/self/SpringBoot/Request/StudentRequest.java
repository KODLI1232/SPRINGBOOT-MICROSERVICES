package Com.self.SpringBoot.Request;

import java.util.List;

import Com.self.SpringBoot.Entity.ApplicationEntity;

public class StudentRequest {
	
	private Long id;
	private String fullName;
	private String emailId;
	private String mobileNumber;
	private String password;
	private String branch;
	private double cgpa;
	private int yearOFPassing;
	
	private List<ApplicationEntity> applicationStatus;
	
	public StudentRequest() {
	
	}

	public StudentRequest(Long id, String fullName, String emailId, String mobileNumber, String password, String branch,
			double cgpa,int yearOFPassing,List<ApplicationEntity> applicationStatus) {
		
		this.id = id;
		this.applicationStatus=applicationStatus;
		this.fullName = fullName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.branch = branch;
		this.cgpa = cgpa;
		this.yearOFPassing=yearOFPassing;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public int getYearOFPassing() {
		return yearOFPassing;
	}

	public void setYearOFPassing(int yearOFPassing) {
		this.yearOFPassing = yearOFPassing;
	}
	

	public List<ApplicationEntity> getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(List<ApplicationEntity> applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	@Override
	public String toString() {
		return "StudentRequest [id=" + id + ", fullName=" + fullName + ", emailId=" + emailId + ", mobileNumber="
				+ mobileNumber + ", password=" + password + ", branch=" + branch + ", cgpa=" + cgpa + ", yearOFPassing=" + yearOFPassing + ", applicationStatus=" + applicationStatus + "]";
	}

}
