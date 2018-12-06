package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Pitcure;

public interface PitcureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pitcure record);

    int insertSelective(Pitcure record);

    Pitcure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pitcure record);

    int updateByPrimaryKey(Pitcure record);
}