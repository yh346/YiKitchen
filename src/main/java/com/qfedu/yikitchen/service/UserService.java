package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.User;
import com.qfedu.yikitchen.vo.ResponseVoo;

public interface UserService {

    public User findUserById(String id);

    public User findUserByUsername(User user);

    ResponseVoo register(String username,String password);
}
