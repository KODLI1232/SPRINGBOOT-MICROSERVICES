package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.UserDetailsEntity;

public interface UserRepository extends JpaRepository<UserDetailsEntity, Integer>{

	
}
