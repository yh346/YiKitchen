package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.ShoppingCar;

public interface ShoppingCarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCar record);

    int insertSelective(ShoppingCar record);

    ShoppingCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppingCar record);

    int updateByPrimaryKey(ShoppingCar record);
}