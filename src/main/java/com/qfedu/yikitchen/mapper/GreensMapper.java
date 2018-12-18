package com.qfedu.yikitchen.mapper;

import com.qfedu.yikitchen.pojo.Greens;
import io.swagger.models.auth.In;

import java.util.List;
import java.util.Map;

public interface GreensMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Greens record);

    int insertSelective(Greens record);

    Greens selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Greens record);

    int updateByPrimaryKeyWithBLOBs(Greens record);

    int updateByPrimaryKey(Greens record);

    List<Greens> selectAll();

    Greens selectById(Integer id);

    List<Greens> selectByGrename(Greens greens);

//    Greens addGreen(Greens greens);

//    int updateplayernum(Integer playernum,Integer id);

    List<Map<String ,String>> getGreurl();

    List<Greens> selectGre();

    List<Map<String,Object>> selectByTypename(String typename);
}