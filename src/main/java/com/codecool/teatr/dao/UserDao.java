package com.codecool.teatr.dao;

import com.codecool.teatr.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
