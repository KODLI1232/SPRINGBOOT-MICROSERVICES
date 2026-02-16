package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.Order_info;

public interface OrderInfoRepository extends JpaRepository<Order_info, Long>{

}
