package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByUsername(@Param("username") String username);

    User findUserById(@Param("id") String Id);
}
