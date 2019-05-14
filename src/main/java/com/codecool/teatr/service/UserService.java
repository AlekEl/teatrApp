package com.codecool.teatr.service;

import com.codecool.teatr.dao.UserDao;
import com.codecool.teatr.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void addUser(User user) {
        userDao.save(user);
    }
}
