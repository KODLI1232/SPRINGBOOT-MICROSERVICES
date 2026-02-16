package Com.self.Spring.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {

List<UserDetails> findByCity(String city);

Optional<UserDetails> findByEmailId(String emailId);

List<UserDetails> findByCityAndGender(String city, String gender);

List<UserDetails> findByCountry(String country);

List<UserDetails> findByCountryAndCity(String country, String city);

void save(Optional<UserDetails> userinfo);

void deleteByEmailId(String emailId);

	

}
