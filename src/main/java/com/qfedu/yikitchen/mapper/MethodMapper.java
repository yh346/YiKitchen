package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Method;

public interface MethodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Method record);

    int insertSelective(Method record);

    Method selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Method record);

    int updateByPrimaryKey(Method record);
}