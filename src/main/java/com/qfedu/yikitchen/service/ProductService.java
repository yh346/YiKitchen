package com.qfedu.yikitchen.service;


import com.qfedu.yikitchen.pojo.Product;
import com.qfedu.yikitchen.vo.ResponseVo;

public interface ProductService {
//    Map<String, List<Product>> find();
    ResponseVo<Product> ById(Integer id);

    ResponseVo<Product> FindById(Integer id);

    ResponseVo<Product> FindAll();
}
