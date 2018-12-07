package com.qfedu.yikitchen.controller;

import com.alibaba.fastjson.JSONObject;
import com.qfedu.yikitchen.annotation.UserLoginToken;
import com.qfedu.yikitchen.pojo.User;
import com.qfedu.yikitchen.service.TokenService;
import com.qfedu.yikitchen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    TokenService tokenService;

    @RequestMapping ("/login")
    public Object login(User user, HttpServletResponse response) {

       // response.addHeader("Access-Control-Allow-Origin", "*");


        System.out.println(user.getUsername());
        JSONObject jsonObject = new JSONObject();
        User userForBase = userService.findUserByUsername(user);
        if (userForBase==null) {
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject;
        } else {

            if (!userForBase.getPassword().equals(user.getPassword())) {
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject;
            } else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);

                return jsonObject;
            }
        }


    }


    @UserLoginToken
    @RequestMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }


    //@UserLoginToken
    @GetMapping("/getindex")
    public String getindex(){
        return "恭喜你成功";
    }
}
