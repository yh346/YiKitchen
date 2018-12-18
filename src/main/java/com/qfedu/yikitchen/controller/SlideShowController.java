package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.service.GreensService;
import com.qfedu.yikitchen.vo.ResponseVoo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "轮播图接口")
@RestController
@RequestMapping("/greens")
public class SlideShowController {

    @Autowired
    private GreensService greensService;

    @ApiOperation(value="轮播图展示", notes="轮播图展示")
    @RequestMapping(value = "/getGreurl",method = RequestMethod.GET)
    public ResponseVoo getGreurl() {

        ResponseVoo vo = greensService.getGreurl();

        return vo;
    }

}
