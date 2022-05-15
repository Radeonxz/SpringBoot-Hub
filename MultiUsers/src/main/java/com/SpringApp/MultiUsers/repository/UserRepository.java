package com.SpringApp.MultiUsers.repository;

import com.SpringApp.MultiUsers.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
