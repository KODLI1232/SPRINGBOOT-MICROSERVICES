package Com.self.SpringBoot.Entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "plm_student_table")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String fullName;
	@Email
	@Column(unique = true)
	private String emailId;
	private String password;
	private String mobileNumber;
	private String branch;
	private double cgpa;
	private Integer yearOFPassing;
	private String role="STUDENT";
	
	@OneToMany(mappedBy = "student",  cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<ApplicationEntity> applicationsApplicationEntities=new ArrayList<>();

	public StudentEntity() {
		
	}

	public StudentEntity(Long id, @NotBlank String fullName, @Email String emailId, String mobileNumber, 
			String branch, double cgpa,Integer yearOfPassing,
			List<ApplicationEntity> applicationsApplicationEntities,String password, String role) {
	
		this.id = id;
		this.fullName = fullName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password=password;
		this.branch = branch;
		this.cgpa = cgpa;
		this.applicationsApplicationEntities = applicationsApplicationEntities;
		this.yearOFPassing=yearOfPassing;
		this.role = role;
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

	public List<ApplicationEntity> getApplicationsApplicationEntities() {
		return applicationsApplicationEntities;
	}

	public void setApplicationsApplicationEntities(List<ApplicationEntity> applicationsApplicationEntities) {
		this.applicationsApplicationEntities = applicationsApplicationEntities;
	}
	
	public Integer getYearOFPassing() {
		return yearOFPassing;
	}

	public void setYearOFPassing(Integer yearOFPassing) {
		this.yearOFPassing = yearOFPassing;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
}

	
	

	


