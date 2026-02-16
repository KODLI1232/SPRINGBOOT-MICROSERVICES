package Com.self.SpringBoot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.SpringBoot.Entity.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer>{

	List<TransactionEntity> findByAccountEntity_Id(Long id);

}
