package com.validation.serversidevalidation.service;

import com.validation.serversidevalidation.model.User;
import com.validation.serversidevalidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
       return userRepository.save(user);
    }
}
