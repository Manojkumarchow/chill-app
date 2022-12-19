package hiring.controller;

import hiring.model.User;
import hiring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:4200"})
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getAllUsers")
    public List<User> getAllUsers() {
        // TODO: Implement List of Users and display as a table
        return userService.findAll();
    }


}
