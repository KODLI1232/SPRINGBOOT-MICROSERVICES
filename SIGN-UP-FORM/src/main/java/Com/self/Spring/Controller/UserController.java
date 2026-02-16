package Com.self.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.self.Spring.Entity.User;
import Com.self.Spring.Service.UserService;

@RestController

//@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userservice;

    @PostMapping("/signup")
    public String signUp(@RequestBody User user) {
        return userservice.SignUp(user);
    }
}
