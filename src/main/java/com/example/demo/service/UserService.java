package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
    UserRepository userRepository;
	
	@Autowired
	private UserMapper userMapper;
	
    public List<User> searchAll() {
        return userRepository.findAll();
    }
    
    public User search(UserSearchRequest userSearchRequest) {
        return userMapper.search(userSearchRequest);
    }
    
}
