package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.OrderDetails;

public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {

}
