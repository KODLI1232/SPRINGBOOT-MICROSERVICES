package Com.self.Spring.repository;

import org.springframework.data.repository.CrudRepository;

import Com.self.Spring.Entity.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Integer> {

}
