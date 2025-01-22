package com.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.User;
import com.employee.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserRepository userRepository;
	
	@Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User validateUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
	
}
