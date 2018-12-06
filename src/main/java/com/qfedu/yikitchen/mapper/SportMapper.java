package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Sport;

public interface SportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sport record);

    int insertSelective(Sport record);

    Sport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sport record);

    int updateByPrimaryKey(Sport record);
}