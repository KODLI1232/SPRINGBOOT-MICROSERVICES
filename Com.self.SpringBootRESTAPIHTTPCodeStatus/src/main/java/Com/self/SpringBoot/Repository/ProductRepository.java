package Com.self.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Com.self.SpringBoot.Entity.ProductDetails;

public interface ProductRepository extends JpaRepository<ProductDetails, Integer> {

	//String findByEmailId(String emailId);
}
