package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Step;

public interface StepMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Step record);

    int insertSelective(Step record);

    Step selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Step record);

    int updateByPrimaryKey(Step record);
}