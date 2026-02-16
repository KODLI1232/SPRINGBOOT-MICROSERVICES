package Com.self.SpringBoot.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.SpringBoot.Entity.ApplicationEntity;

public interface ApplicationRepository extends JpaRepository<ApplicationEntity, Long>{

	Optional<ApplicationEntity> findByStudentIdAndCompanyId(Long studentId, Long companyId);

	List<ApplicationEntity> findByStudentId(Long studentId);

	List<ApplicationEntity> findByCompanyId(Long companyId);

}
