package Com.self.SpringBoot.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "plm_company_table")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String companyName;

    @NotBlank
    private String jobRole;

    @NotNull
    private Double packageAmount;   // LPA

    @NotNull
    private Double minCgpa;

    private String location;

    private String description;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ApplicationEntity> applications = new ArrayList<>();

    // Getters and Setters
    public Long getId() {
    	return id; 
    	}

    public void setId(Long id) { 
    	this.id = id;
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

    public List<ApplicationEntity> getApplications() {
    	return applications;
    	}

    public void setApplications(List<ApplicationEntity> applications) {
        this.applications = applications;
    }
}

	
	
