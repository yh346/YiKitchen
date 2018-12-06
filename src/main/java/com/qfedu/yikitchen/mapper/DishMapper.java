package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Dish;

public interface DishMapper {
    int insert(Dish record);

    int insertSelective(Dish record);
}