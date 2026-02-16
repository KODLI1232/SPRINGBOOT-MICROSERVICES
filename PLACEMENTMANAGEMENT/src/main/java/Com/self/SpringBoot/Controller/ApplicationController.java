package Com.self.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Entity.ApplicationEntity;
import Com.self.SpringBoot.Service.ApplicationService;

@RestController
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;
	
	// To apply for a Job
	
	@PostMapping("/apply/student/{studentId}/company/{companyId}")
	public String applyForCompany(@PathVariable long studentId, Long companyId) {
		
		return applicationService.studentapplyForCompany(studentId,companyId);
	}
	
	// Student to view their applications
	@GetMapping("/student/{studentId}")
	public List<ApplicationEntity> getStudentApplications(@PathVariable Long studentId){
		return applicationService.getStudentApplications(studentId);
	}
	
	//Admin to view companyApplications
	@GetMapping("/admin/company/{companyId}")
	public List<ApplicationEntity> getCompanyApplications(@PathVariable Long companyId){
		return applicationService.getCompanyApplications(companyId);
	}
	
	// admin to update the ststus of student applications
	
//	@PutMapping("/admin/update/status/{applicationId}")
//	public String updateApplicationStatus(@PathVariable Long applicationId,@RequestParam ApplicationStatus status) {
//		return applicationService.updateApplicationStatus(applicationId, status);
//	}
}
