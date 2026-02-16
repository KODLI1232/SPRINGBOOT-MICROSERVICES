package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.DeliveryAddressEntity;

public interface DeliveryAddress extends JpaRepository<DeliveryAddressEntity, Integer>{

}
