package com.example.springbootmysql.repository;

import com.example.springbootmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByEmail(String email);

}
