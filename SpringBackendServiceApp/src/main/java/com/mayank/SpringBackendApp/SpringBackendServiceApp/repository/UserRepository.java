package com.mayank.SpringBackendApp.SpringBackendServiceApp.repository;

import com.mayank.SpringBackendApp.SpringBackendServiceApp.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
