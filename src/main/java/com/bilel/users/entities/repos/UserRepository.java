package com.bilel.users.entities.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bilel.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
