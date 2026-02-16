package Com.self.SpringBoot.Dtos;

import java.time.LocalDate;
import Com.self.SpringBoot.Enums.ApplicationStatus;

	public class ApplicationResponseDto {
	    private Long id;
	    private String studentName;
	    private String studentEmail;
	    private String studentBranch;
	    private Double studentCgpa;
	    private String companyName;
	    private String jobRole;
	    private Double packageAmount;
	    private String location;
	    private ApplicationStatus status;
	    private LocalDate applieDate;

	    
	    public ApplicationResponseDto(Long id, String studentName, String studentEmail, 
	                                String studentBranch, Double studentCgpa,
	                                String companyName, String jobRole, Double packageAmount,
	                                String location, ApplicationStatus status, LocalDate applieDate) {
	        this.id = id;
	        this.studentName = studentName;
	        this.studentEmail = studentEmail;
	        this.studentBranch = studentBranch;
	        this.studentCgpa = studentCgpa;
	        this.companyName = companyName;
	        this.jobRole = jobRole;
	        this.packageAmount = packageAmount;
	        this.location = location;
	        this.status = status;
	        this.applieDate = applieDate;
	    }

	   
	    public Long getId() {
	    		return id; 
	    	}
	    public void setId(Long id) {
	    		this.id = id; 
	    	}
	    
	    public String getStudentName() { 
	    		return studentName; 
	    	}
	    public void setStudentName(String studentName) {
	    		this.studentName = studentName; 
	    	}
	    
	    public String getStudentEmail() { 
	    		return studentEmail;
	    	}
	    
	    public void setStudentEmail(String studentEmail) { 
	    		this.studentEmail = studentEmail;
	    	}
	    
	    public String getStudentBranch() {
	    		return studentBranch;
	    	}
	    
	    public void setStudentBranch(String studentBranch) {
	    		this.studentBranch = studentBranch; 
	    	}
	    
	    public Double getStudentCgpa() {
	    		return studentCgpa; 
	    	}
	    
	    public void setStudentCgpa(Double studentCgpa) {
	    		this.studentCgpa = studentCgpa; 
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
	    
	    public String getLocation() { 
	    		return location;
	    	}
	    
	    public void setLocation(String location) {
	    		this.location = location;
	    	}
	    
	    public ApplicationStatus getStatus() {
	    	return status; 
	    	}
	    
	    public void setStatus(ApplicationStatus status) {
	    	this.status = status;
	    	}
	    
	    public LocalDate getApplieDate() { 
	    	return applieDate; 
	    	}
	    
	    public void setApplieDate(LocalDate applieDate) {
	    	this.applieDate = applieDate; 
	    	}
	}


