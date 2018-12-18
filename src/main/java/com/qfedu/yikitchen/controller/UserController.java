package com.qfedu.yikitchen.controller;

import com.alibaba.fastjson.JSONObject;
import com.qfedu.yikitchen.pojo.User;
import com.qfedu.yikitchen.service.TokenService;
import com.qfedu.yikitchen.service.UserService;
import com.qfedu.yikitchen.vo.ResponseVoo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Api(description = "用户模块接口")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    TokenService tokenService;

    @ApiOperation(value="用户登录", notes="")
    //@ApiImplicitParam(name = "playernum", value = "观看量加一后的数值")
    @RequestMapping (value = "/login",method = RequestMethod.POST)
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

    @ApiOperation(value="用户注册", notes="")
    //@ApiImplicitParam(name = "playernum", value = "观看量加一后的数值")
   @RequestMapping(value = "register",method = RequestMethod.POST)
    public ResponseVoo<User> register(String username,String password) {
/*       User user1=new User();
     user1.setUsername(username);
     user1.setPassword(password);*/

        ResponseVoo vo = userService.register(username,password);
        System.out.println(vo.getData());
        if(vo.getData().isEmpty()) {
            vo.setCode(100);
            vo.setMsg("注册失败");
        } else {
            vo.setCode(200);
            vo.setMsg("注册成功");
        }

        return vo;
   }

}
