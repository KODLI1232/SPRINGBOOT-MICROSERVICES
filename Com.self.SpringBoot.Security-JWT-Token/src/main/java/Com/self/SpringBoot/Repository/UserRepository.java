package Com.self.SpringBoot.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.SpringBoot.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    Optional<UserEntity> findByEmailId(String emailId);

	UserEntity findByEmailIdAndPassword(String emailId,String password);

}



