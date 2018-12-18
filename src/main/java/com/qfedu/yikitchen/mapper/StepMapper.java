package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Step;

import java.util.List;

public interface StepMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Step record);

    int insertSelective(Step record);

    Step selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Step record);

    int updateByPrimaryKey(Step record);

    List<Step> getStepByGreensid(Integer id);

    int insertStep(List<Step> steps);
}