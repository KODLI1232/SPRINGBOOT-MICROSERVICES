package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.OrderDetailsEntity;

public interface OrderRepository  extends JpaRepository<OrderDetailsEntity, Integer>{

}
