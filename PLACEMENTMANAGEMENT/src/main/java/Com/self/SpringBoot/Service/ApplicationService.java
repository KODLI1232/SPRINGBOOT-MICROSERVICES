package Com.self.SpringBoot.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.SpringBoot.Entity.ApplicationEntity;
import Com.self.SpringBoot.Entity.CompanyEntity;
import Com.self.SpringBoot.Entity.StudentEntity;
import Com.self.SpringBoot.Enums.ApplicationStatus;
import Com.self.SpringBoot.Repository.ApplicationRepository;
import Com.self.SpringBoot.Repository.CompanyRepository;
import Com.self.SpringBoot.Repository.StudentRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ApplicationService {

	@Autowired
	ApplicationRepository applicationRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	CompanyRepository companyRepository;
	
	// student applies for a company
	public String studentapplyForCompany(Long studentId,Long companyId) {
		
		// then we check for student existence
		
		StudentEntity student =studentRepository.findById(studentId)
												.orElseThrow(()-> new RuntimeException("Student Not Found"));		
		// check company exists or not
		CompanyEntity company=companyRepository.findById(companyId)
												.orElseThrow(()->new RuntimeException("Company not Found"));
	
	
	// then we check whether student has criteria like cgpa
	
	if(student.getCgpa()<company.getMinCgpa()) {
		return "Not eligible for company";
	}
	
	// checking if student has made multiple applications
	
	if (applicationRepository.findByStudentIdAndCompanyId(studentId,companyId).isPresent()) {
		
		return "already applied";
	}
	
	ApplicationEntity  applicationEntity=new ApplicationEntity();
	applicationEntity.setStudent(student);
	applicationEntity.setCompany(company);
	applicationEntity.setStatus(ApplicationStatus.APPLIED);
	applicationEntity.setApplieDate(LocalDate.now());
	
	applicationRepository.save(applicationEntity);
	
	return "Applied Successfully";
	
	}
	
	// To know the Students application Status
	
	public List<ApplicationEntity> getStudentApplications(Long studentId){
		return applicationRepository.findByStudentId(studentId);
	}
	
	// For admin to know the how many applications got applied
	
	public List<ApplicationEntity> getCompanyApplications(Long companyId){
		
		return applicationRepository.findByCompanyId(companyId);
	}
	
	// now admin can update applications whether students are eligible or not
	
	public String updateApplicationStatus(Long applicationId,ApplicationStatus status) {
		
		ApplicationEntity application=applicationRepository.findById(applicationId)
					
												.orElseThrow(()->new RuntimeException("Application not found"));
	
		application.setStatus(status);
		applicationRepository.save(application);
		
		return "Application Status updated to "+status;
	}

	
	
	
	
}
