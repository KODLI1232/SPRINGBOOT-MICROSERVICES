package Com.self.SpringBoot.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Entity.CompanyEntity;
import Com.self.SpringBoot.Entity.StudentEntity;
import Com.self.SpringBoot.Enums.ApplicationStatus;
import Com.self.SpringBoot.Service.AdminService;

@PreAuthorize("hasRole('ADMIN')")
@RestController
@RequestMapping("/api/admin")  //CONSISTENT with other controllers
public class AdminController {

    @Autowired
    private AdminService adminService;
    
    
    @GetMapping("/students")
    public ResponseEntity<List<StudentEntity>> getAllStudents() {
        return ResponseEntity.ok(adminService.getAllStudents());
    }
    
     
    @GetMapping("/companies")
    public ResponseEntity<List<CompanyEntity>> getAllCompanies() {
        return ResponseEntity.ok(adminService.getAllCompanies());
    }
    
   
    @PutMapping("/application/{applicationId}/status")
    public ResponseEntity<String> updateApplicationStatus(
            @PathVariable Long applicationId,
            @RequestParam ApplicationStatus status) {
        String result = adminService.updateApplicationStatus(applicationId, status);
        return ResponseEntity.ok(result);
    }
    
    
    @GetMapping("/applications")
    public ResponseEntity<List<Com.self.SpringBoot.Entity.ApplicationEntity>> getAllApplications() {
        return ResponseEntity.ok(adminService.getAllApplications());
    }
}
