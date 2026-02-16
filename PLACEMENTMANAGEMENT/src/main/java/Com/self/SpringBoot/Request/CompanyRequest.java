package Com.self.SpringBoot.Request;


public class CompanyRequest {
	
	 private String companyName;
	    private String jobRole;
	    private Double packageAmount;
	    private Double minCgpa;
	    private String location;
	    private String description;
	
	public CompanyRequest() {
		
	}

	public CompanyRequest(String companyName, String jobRole, Double packageAmount, Double minCgpa, String location,
			String description) {
		
		this.companyName = companyName;
		this.jobRole = jobRole;
		this.packageAmount = packageAmount;
		this.minCgpa = minCgpa;
		this.location = location;
		this.description = description;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public Double getPackageAmount() {
		return packageAmount;
	}

	public void setPackageAmount(Double packageAmount) {
		this.packageAmount = packageAmount;
	}

	public Double getMinCgpa() {
		return minCgpa;
	}

	public void setMinCgpa(Double minCgpa) {
		this.minCgpa = minCgpa;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CompanyRequest [companyName=" + companyName + ", jobRole=" + jobRole + ", packageAmount="
				+ packageAmount + ", minCgpa=" + minCgpa + ", location=" + location + ", description=" + description
				+ "]";
	}

	
	
	
}
