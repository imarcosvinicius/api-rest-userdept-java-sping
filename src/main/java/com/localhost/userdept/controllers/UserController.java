package com.localhost.userdept.controllers;

import com.localhost.userdept.entities.User;
import com.localhost.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping // list all users
    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")// List a user by id
    public User findById(@PathVariable Long id) {
        User result = repository.findById(id).get();
        return result;
    }

    @PostMapping // Create a new contact
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }
}
