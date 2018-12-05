package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.User;

public interface UserService {

    public User findUserById(String id);

    public User findUserByUsername(User user);
}
