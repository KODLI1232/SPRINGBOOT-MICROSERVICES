package Com.self.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Entity.CompanyEntity;
import Com.self.SpringBoot.Request.CompanyRequest;
import Com.self.SpringBoot.Service.CompanyService;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    // For Admin
@PostMapping("/admin/addCompany")
public String addCompany(@RequestBody CompanyRequest companyRequest) {
	
	return companyService.addCompany(companyRequest);
}
    
    // For Student
    @GetMapping("/student/allCompanies")
    public List<CompanyEntity> getAllCompanies(){
    	return companyService.getAllCompanies();
    }
    
    @GetMapping("/{id}")
    public CompanyEntity getCompanyById(@PathVariable Long id) {
    	return companyService.getCompanyById(id);
    }
    
}

	
	

