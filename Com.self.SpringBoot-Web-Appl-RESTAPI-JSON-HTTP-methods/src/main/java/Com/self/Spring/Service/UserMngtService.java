package Com.self.Spring.Service;

import org.springframework.stereotype.Service;

@Service
public class UserMngtService {
	
	public String addUser() {
		
		return "Useradded suuccessfully";
	}
	
public String deleteUser() {
		
		return "deleted User suuccessfully";
	}
	
	
public String UpdateUser() {
		
		return "Updated USer suuccessfully";
	}

public String GetUserInfo() {
	
	return " USer info got suuccessfully";
}

}
