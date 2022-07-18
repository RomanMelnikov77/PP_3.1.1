package com.example.springTable.service;

import com.example.springTable.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    User saveUser(User user);
    void deleteById(int id);
}
