package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.pojo.Product;
import com.qfedu.yikitchen.service.ProductService;
import com.qfedu.yikitchen.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="集市页面Controller")
@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("list")
    @ApiOperation(value="查找集市列表页", notes="查找集市列表页" ,httpMethod="GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id", value="传入的商品类型的ID", dataType = "Integer", required=true, paramType="form"),
    })
    public ResponseVo<Product> find(Integer id) {
        return service.ById(id);
    }

    @RequestMapping("detali")
    @ApiOperation(value="查找商品详情页", notes="查找商品详情页" ,httpMethod="POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id", value="传入的商品ID至详情页", dataType = "Integer", required=true, paramType="form"),
    })
    public ResponseVo<Product> findDetaie(Integer id) {
        return service.FindById(id);
    }



    @RequestMapping("findAll")
    @ApiOperation(value="查找所有商品", notes="查找所有商品" ,httpMethod="GET")

    public ResponseVo<Product> findAll() {
        return service.FindAll();

    }
}
