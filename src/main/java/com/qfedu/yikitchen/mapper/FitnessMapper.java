package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Fitness;

public interface FitnessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fitness record);

    int insertSelective(Fitness record);

    Fitness selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fitness record);

    int updateByPrimaryKey(Fitness record);
}