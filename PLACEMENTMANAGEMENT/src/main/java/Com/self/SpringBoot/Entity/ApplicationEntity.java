package Com.self.SpringBoot.Entity;

import java.time.LocalDate;
import Com.self.SpringBoot.Enums.ApplicationStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "plm_application_table")
public class ApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private StudentEntity student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private CompanyEntity company;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    private LocalDate applieDate;

    public ApplicationEntity() {}

    // FIXED: Correct getters/setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudentEntity getStudent() {  // FIXED: was getStudentEntity()
        return student;
    }

    public void setStudent(StudentEntity student) {  // FIXED: was setStudentEntity()
        this.student = student;
    }

    public CompanyEntity getCompany() {  // FIXED: was getCompanyEntity()
        return company;
    }

    public void setCompany(CompanyEntity company) {  // FIXED: was setCompanyEntity()
        this.company = company;
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
    // REMOVED: Useless setCompanyEntity(ApplicationStatus) method
}
