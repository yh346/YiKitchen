package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.pojo.Discuss;
import com.qfedu.yikitchen.pojo.Like;
import com.qfedu.yikitchen.service.DiscussService;
import com.qfedu.yikitchen.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "评论接口")
public class DiscussController {
    @Autowired
     private DiscussService discussService;

    @ApiOperation(value = "查询评论",httpMethod = "GET",notes = "获取评论结果")
    @RequestMapping("selectDiscuss")
    public ResultBean selectDiscuss(HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", "*");
        return discussService.selectDiscuss();
    }
    @ApiOperation(value = "添加评论",httpMethod = "GET",notes = "添加评论")
    @RequestMapping("addDiscuss")
    public ResultBean addDiscuss(Discuss discuss){
        return discussService.addDiscuss(discuss);
    }

}
