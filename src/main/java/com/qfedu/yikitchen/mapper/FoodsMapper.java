package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Foods;

public interface FoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Foods record);

    int insertSelective(Foods record);

    Foods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Foods record);

    int updateByPrimaryKey(Foods record);
}