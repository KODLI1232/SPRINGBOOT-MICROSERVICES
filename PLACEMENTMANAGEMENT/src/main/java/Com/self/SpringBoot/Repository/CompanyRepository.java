package Com.self.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.SpringBoot.Entity.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long>{

}
