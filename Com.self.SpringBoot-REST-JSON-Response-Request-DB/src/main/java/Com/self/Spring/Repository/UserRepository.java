package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.self.Spring.Entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, String>{

	UserDetails findByEmailIDAndPassword(String emailID,String password);

	

}
