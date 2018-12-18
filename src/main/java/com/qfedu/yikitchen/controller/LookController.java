package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.pojo.Discuss;
import com.qfedu.yikitchen.pojo.Look;
import com.qfedu.yikitchen.service.LookService;
import com.qfedu.yikitchen.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "观看接口")
public class LookController {
    @Autowired
    private LookService lookService;

    @ApiOperation(value = "查询观看",httpMethod = "GET",notes = "获取观看结果")
    @RequestMapping("selectNum")
    public ResultBean selectNum(HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", "*");
        return lookService.selectNum();
    }
   /* @ApiOperation(value = "添加观看人数",httpMethod = "GET",notes = "添加观看")
    @RequestMapping("addLook")
    public ResultBean addLook(Look look){

        return lookService.addLook(look);
    }*/
}
