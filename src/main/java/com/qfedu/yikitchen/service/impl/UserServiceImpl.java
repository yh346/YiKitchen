package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(String id) {

        User user = userMapper.findUserById(id);
        return  user;
    }

    @Override
    public User findUserByUsername(User user) {

        String username = user.getUsername();
        //System.out.println("service****" + user.getUsername());
        User user1 = userMapper.findByUsername(username);
      return  user1;
    }
}
