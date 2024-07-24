package com.validation.serversidevalidation.controller;

import com.validation.serversidevalidation.model.User;
import com.validation.serversidevalidation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid User user) {
        User savedUser=userService.save(user);
        return ResponseEntity.ok(savedUser);
    }

}
