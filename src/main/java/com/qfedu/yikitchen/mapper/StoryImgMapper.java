package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.StoryImg;

import java.util.List;

public interface StoryImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StoryImg storyImg);

    int insertSelective(StoryImg record);

    StoryImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoryImg record);

    int updateByPrimaryKey(StoryImg record);

    int inserts(List<StoryImg> storyImgs);
}