package com.example.Test.Controller;

import com.example.Test.Entity.User;
import com.example.Test.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService ser;

    public UserController(UserService ser) {
        this.ser = ser;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return ser.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return ser.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return ser.getUserById(id);
    }
}
