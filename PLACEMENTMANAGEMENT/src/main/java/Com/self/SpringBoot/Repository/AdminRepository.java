package Com.self.SpringBoot.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.SpringBoot.Entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Long>{

	 Optional<AdminEntity> findByEmail(String email);

}
