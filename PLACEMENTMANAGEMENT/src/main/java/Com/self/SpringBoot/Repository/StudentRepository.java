package Com.self.SpringBoot.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import Com.self.SpringBoot.Entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

	Optional	<StudentEntity> findByEmailId(String emailId);

	boolean existsByEmailId(String emailId);
}
