package Com.self.Spring.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByEmail(String email);

}
