package Com.self.SpringBoot.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.self.SpringBoot.Entity.AccountEntity;

public interface AccountRepository  extends JpaRepository<AccountEntity, Integer>{

	  Optional<AccountEntity> findByUsername(String username);

	

}
