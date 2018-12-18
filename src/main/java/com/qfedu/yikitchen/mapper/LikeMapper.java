package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Like;

import java.util.List;

public interface LikeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Like record);

    int insertSelective(Like record);

    Like selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Like record);

    int updateByPrimaryKey(Like record);

    Like likeOrNo(Like like);

    int delete(Like like);

    List<Like> LikeNum();
}