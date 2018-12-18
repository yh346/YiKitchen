package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.pojo.Orders;
import com.qfedu.yikitchen.service.OrdersService;
import com.qfedu.yikitchen.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value="订单详情Controller")
@RestController
public class OrdersController {
    @Autowired
    OrdersService service;

    @RequestMapping("findOr")
    @ApiOperation(value="查找订单", notes="查找订单" ,httpMethod="GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id", value="传入的用户ID", dataType = "String", required=true, paramType="form"),
    })
    public ResponseVo<Orders> findOr(Integer id) {
        return service.find(id);
    }


    @RequestMapping("addOr")
    @ApiOperation(value="添加新订单", notes="添加新订单" ,httpMethod="POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orders", value="传入的订单数据", dataType = "String", required=true, paramType="form"),
    })
    public ResponseVo<Orders> addOr(Orders orders) {
        return service.addOrders(orders);
    }
}
