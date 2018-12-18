package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.pojo.Address;
import com.qfedu.yikitchen.service.AddressService;
import com.qfedu.yikitchen.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(description="订单地址Controller")
@RestController
public class AdressController {

    @Autowired
    AddressService addressService;



    @GetMapping  ("findAddr")
    @ApiOperation(value="查找收货地址", notes="查找收货地址" ,httpMethod="GET")
    public ResponseVo<Address> findAddr() {
       return addressService.findAddr();
    }

    @PostMapping("addAddr")
    @ApiOperation(value="添加收货地址", notes="添加收货地址" ,httpMethod="POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="address", value="收货地址对象", dataType = "String", required=true, paramType="form"),
    })
    public ResponseVo<Address> addAddr( Address address) {
        return addressService.addAddr(address);
    }
}
