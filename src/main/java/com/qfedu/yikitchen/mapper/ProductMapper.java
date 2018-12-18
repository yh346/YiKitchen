package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Product;


import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> select(Integer id);

    List<Product> selectById(Integer id);


    List<Product> selectAll();
}