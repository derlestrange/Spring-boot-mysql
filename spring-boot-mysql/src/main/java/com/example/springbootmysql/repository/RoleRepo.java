package com.example.springbootmysql.repository;

import com.example.springbootmysql.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Integer> {
    Role findByRole(String role);
}
