package com.gastonmatta.shoppingCartAPI.controller;

import com.gastonmatta.shoppingCartAPI.domain.User;
import com.gastonmatta.shoppingCartAPI.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @GetMapping("/users")
    Iterable<User> all() {
        return service.getAllUsers();
    }

    @PostMapping("/users")
    User newUser(@RequestBody User newUser){
        return service.addUser(newUser);
    }

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable Integer id){
        return service.getUserById(id);
    }

    @GetMapping("/users/byUsername/{username}")
    User getUserByUsername(@PathVariable String username){
        return service.getUserByUsername(username);
    }

    @GetMapping("/users/byFirstName/{firstName}")
    User getUserByFirstName(@PathVariable String firstName){
        return service.getUserByFirstName(firstName);
    }

    @PutMapping("/users/{id}")
    User updateUserById(@RequestBody User newUser, @PathVariable Integer id){
        return service.updateUserById(id, newUser);
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Integer id){
        service.deleteUser(id);
    }
}
