package com.employee.services;

import com.employee.entities.User;

public interface UserService 
{
	public User validateUser(String username, String password);
   
    public void saveUser(User user);
}
