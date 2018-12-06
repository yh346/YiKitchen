package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.StoryImg;

public interface StoryImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StoryImg record);

    int insertSelective(StoryImg record);

    StoryImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoryImg record);

    int updateByPrimaryKey(StoryImg record);
}