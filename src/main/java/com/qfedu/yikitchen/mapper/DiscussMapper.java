package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Discuss;

import java.util.List;

public interface DiscussMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    Discuss selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKey(Discuss record);

    List<Discuss> selectDiscuss();
}