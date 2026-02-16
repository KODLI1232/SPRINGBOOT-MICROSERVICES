package Com.self.Spring.Operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.self.Spring.Entity.Student;
import Com.self.Spring.Entity.UserInfo;
import Com.self.Spring.repository.StudentRepository;
import Com.self.Spring.repository.UserInfoRepository;

@Component
public class DatabaseOperations {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	UserInfoRepository userInfoRepository;
	
	// we need to insert details  // use insert
	
	public void addStudentinfo() {
		
		// create entity object
		Student stu=new Student();
		stu.setSid(112);
		stu.setSname("NSK");
		stu.setsGpa(5.21);
		studentRepository.save(stu);
	}
	
	// add userinfo
	
	public void addUserInfo() {
		
		// enetity object
		UserInfo userInfo =new UserInfo();
		userInfo.setIdStickers(1111);
		userInfo.setNameStickers("KLRWA");
		userInfo.setSizeStickers("31");
		
		// pass  entity objects to repo:UserRepository
		
		userInfoRepository.save(userInfo);
	}
	
//	public void deleteUserInfo() {
//		userInfoRepository.deleteAll();
//	}
}
