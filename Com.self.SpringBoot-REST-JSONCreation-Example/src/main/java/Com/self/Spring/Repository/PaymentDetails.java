package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.PaymentDetailsEntity;

public interface PaymentDetails extends JpaRepository<PaymentDetailsEntity, Integer> {

}
