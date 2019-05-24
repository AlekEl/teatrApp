package com.codecool.teatr.service;

import com.codecool.teatr.dao.UserDao;
import com.codecool.teatr.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void addUser(User user) {
        userDao.save(user);
    }

    public Optional<User> getUserById(int id){
        return Optional.ofNullable(userDao.getOne(id));
    }

}
