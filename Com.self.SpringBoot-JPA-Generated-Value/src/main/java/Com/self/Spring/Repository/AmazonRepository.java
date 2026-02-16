package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.AmazonOrder;

public interface AmazonRepository extends JpaRepository<AmazonOrder, String> {

	
}
