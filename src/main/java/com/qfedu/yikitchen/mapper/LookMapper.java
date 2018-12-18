package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Look;

import java.util.List;

public interface LookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Look record);

    int insertSelective(Look record);

    Look selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Look record);

    int updateByPrimaryKey(Look record);

    List<Look> LooksNum();
}