package com.bilel.users.entities.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bilel.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByRole(String role);

}
