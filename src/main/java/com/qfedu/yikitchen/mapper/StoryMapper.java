package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Story;

import java.util.List;

public interface StoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Story record);

    int insertSelective(Story record);

    Story selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Story record);

    int updateByPrimaryKey(Story record);

    List<Story> selectFocus(Integer id);

    List<Story> selectAllStory();

    List<Story> selectStoryByTime();
}