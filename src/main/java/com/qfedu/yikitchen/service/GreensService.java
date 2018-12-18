package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.Dish;
import com.qfedu.yikitchen.pojo.Greens;
import com.qfedu.yikitchen.pojo.Step;
import com.qfedu.yikitchen.vo.ResponseVoo;

import java.util.List;

public interface GreensService {

    ResponseVoo<Greens> getAllGreens();

    Greens getGreensById(Integer id);

    ResponseVoo<Greens> getGreenByGrename(String grename);

    ResponseVoo addGreens(Greens greens, List<Step> steps, List<Dish> dishes);

    ResponseVoo growPlayer(Integer playernum, Integer id);

    ResponseVoo growColletnum(Integer colletnum, Integer id);

    ResponseVoo getGreurl();

    ResponseVoo<Greens> weekgre();

    ResponseVoo getGreByTypename(String typename);
}
