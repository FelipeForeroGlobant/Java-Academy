package com.example.webServiceMessages.repository;

import com.example.webServiceMessages.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

}
