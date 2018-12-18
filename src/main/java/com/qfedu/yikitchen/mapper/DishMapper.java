package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Dish;

import java.util.List;

public interface DishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dish record);

    int insertSelective(Dish record);

    Dish selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);

    List<Dish> getDishByGreensid(Integer id);

    int insertDish(List<Dish> dishes);

}