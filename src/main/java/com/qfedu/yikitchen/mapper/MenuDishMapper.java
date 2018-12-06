package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.MenuDish;

public interface MenuDishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuDish record);

    int insertSelective(MenuDish record);

    MenuDish selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuDish record);

    int updateByPrimaryKey(MenuDish record);
}