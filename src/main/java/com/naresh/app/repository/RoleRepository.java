package com.naresh.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naresh.app.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
 
}