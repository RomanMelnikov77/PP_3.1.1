package com.example.springTable.service;

import com.example.springTable.model.User;
import com.example.springTable.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Transactional
    public User findById(int id) {
        return userRepository.findById(id).orElse(null);

    }
    @Transactional
    public User saveUser(User user) {
return userRepository.save(user);
    }

    @Transactional
    public void deleteById(int id) {
        userRepository.deleteById(id);

    }

}
