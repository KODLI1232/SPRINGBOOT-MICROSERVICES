package Com.self.SpringBoot.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.SpringBoot.Entity.CompanyEntity;
import Com.self.SpringBoot.Repository.CompanyRepository;
import Com.self.SpringBoot.Request.CompanyRequest;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public String addCompany(CompanyRequest companyRequest) {
    	
    	CompanyEntity companyEntity=new CompanyEntity();
    	
    	companyEntity.setCompanyName(companyRequest.getCompanyName());
    	companyEntity.setJobRole(companyRequest.getJobRole());
    	companyEntity.setPackageAmount(companyRequest.getPackageAmount());
    	companyEntity.setMinCgpa(companyRequest.getMinCgpa());
    	companyEntity.setLocation(companyRequest.getLocation());
    	companyEntity.setDescription(companyRequest.getDescription());
    	
    	companyRepository.save(companyEntity);
    	
    	return "Company added successfully";
    }
    
    public List<CompanyEntity> getAllCompanies(){
     	return companyRepository.findAll();
    }
    
    public CompanyEntity getCompanyById(Long id) {
    	
    	return companyRepository.findById(id)
    										.orElseThrow(()->new RuntimeException("Company Not Found"));
    }
    
    
}
