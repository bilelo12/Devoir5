package com.bilel.users.entities.service;

import com.bilel.users.entities.Role;
import com.bilel.users.entities.User;

public interface UserService {
	
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);

}
