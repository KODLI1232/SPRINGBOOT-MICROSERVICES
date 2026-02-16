package Com.self.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.Spring.Entity.ProductInformationEntity;

public interface ProductInformation extends JpaRepository<ProductInformationEntity, Integer> {

}
