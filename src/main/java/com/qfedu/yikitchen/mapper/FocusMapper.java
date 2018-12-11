package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Focus;

public interface FocusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Focus record);

    int insertSelective(Focus record);

    Focus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Focus record);

    int updateByPrimaryKey(Focus record);

    int FocusOrNo(Focus focus);

    int delete(Focus focus);
}