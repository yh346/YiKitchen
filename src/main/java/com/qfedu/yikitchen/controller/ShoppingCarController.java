package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.pojo.ShoppingCar;
import com.qfedu.yikitchen.service.ShoppingCarService;
import com.qfedu.yikitchen.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="购物车Controller")
public class ShoppingCarController {
    @Autowired
    ShoppingCarService carService;

    @RequestMapping("addShop")
    @ApiOperation(value="添加至购物车", notes="添加至购物车" ,httpMethod="POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="shoppingCar", value="购物车对象", dataType = "Integer", required=true, paramType="form"),
    })
    public ResponseVo<ShoppingCar> addShop(ShoppingCar shoppingCar){
        return  carService.addShop(shoppingCar);
    }


    @RequestMapping("showShoppingcar")
    @ApiOperation(value=" 展示购物车详情页", notes="展示购物车详情页" ,httpMethod="POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id", value="传入的用户ID", dataType = "Integer", required=true, paramType="form"),
    })
    public ResponseVo<ShoppingCar> showShoppingcar(Integer id){
        return  carService.showShoppingCar(id);
    }

}
