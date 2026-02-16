package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {

	
	
}
