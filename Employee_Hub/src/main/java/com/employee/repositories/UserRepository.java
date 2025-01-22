package com.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	User findByUsernameAndPassword(String username, String password);
}
