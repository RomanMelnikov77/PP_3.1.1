package com.example.springTable.service;

import com.example.springTable.model.User;
import com.example.springTable.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(int id) {
        return userRepository.findById(id).orElse(null);

    }

    public User saveUser(User user) {
return userRepository.save(user);
    }


    public void deleteById(int id) {
        userRepository.deleteById(id);

    }

}
