package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Cookie;

public interface CookieMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cookie record);

    int insertSelective(Cookie record);

    Cookie selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cookie record);

    int updateByPrimaryKey(Cookie record);
}