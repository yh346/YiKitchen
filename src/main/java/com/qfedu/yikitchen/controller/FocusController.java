package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.pojo.Focus;
import com.qfedu.yikitchen.service.FocusService;
import com.qfedu.yikitchen.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "关注接口")
public class FocusController {
    @Autowired
    private FocusService focusService;

    @ApiOperation(value = "查询关注与否",httpMethod = "GET",notes = "获取关注结果")
    @RequestMapping("selectFocus")
    public ResultBean selectFocus(Focus focus){
        return focusService.FocusOrNo(focus);
    }

}
