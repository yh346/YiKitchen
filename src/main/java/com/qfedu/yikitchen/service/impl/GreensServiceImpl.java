package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.DishMapper;
import com.qfedu.yikitchen.mapper.GreensMapper;
import com.qfedu.yikitchen.mapper.StepMapper;
import com.qfedu.yikitchen.pojo.Dish;
import com.qfedu.yikitchen.pojo.Greens;
import com.qfedu.yikitchen.pojo.Step;
import com.qfedu.yikitchen.service.GreensService;
import com.qfedu.yikitchen.vo.ResponseVo;
import com.qfedu.yikitchen.vo.ResponseVoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GreensServiceImpl implements GreensService {

    @Autowired
    private GreensMapper greensMapper;

    @Autowired
    private DishMapper dishMapper;

    @Autowired
    private StepMapper stepMapper;

    @Override
    public ResponseVoo<Greens> getAllGreens() {

        List<Greens> greens = greensMapper.selectAll();
        ResponseVoo<Greens> vo = new ResponseVoo<>();
        vo.setData(greens);
        return vo;
    }

    @Override
    public Greens getGreensById(Integer id) {

        Greens greens = greensMapper.selectById(id);

        List<Dish> dishs = dishMapper.getDishByGreensid(id);
        List<Step> steps = stepMapper.getStepByGreensid(id);
        greens.setDishes(dishs);
        greens.setSteps(steps);
        return greens;
    }

    @Override
    public ResponseVoo<Greens> getGreenByGrename(String grename) {
        Greens greens1 = new Greens();
        greens1.setGrename(grename);
        ResponseVoo<Greens> vo = new ResponseVoo<>();
        List<Greens> greens = greensMapper.selectByGrename(greens1);
        vo.setData(greens);
        return vo;
    }

    @Override
    public ResponseVoo addGreens(Greens greens, List<Step> steps, List<Dish> dishes) {


        int i = greensMapper.insertSelective(greens);
        Integer id = greens.getId();

        for (i = 0;i<steps.size();i++) {
            steps.get(i).setGreensid(id);
        }

        int i1 = dishMapper.insertDish(dishes);

        for (i = 0;i<dishes.size();i++) {
            dishes.get(i).setGreensid(id);
        }

        int i2 = stepMapper.insertStep(steps);

        ResponseVoo vo = new ResponseVoo<>();

        if (i > 0 && i1 > 0 && i2 > 0) {
            vo = ResponseVoo.OK();
        } else {
            vo = ResponseVoo.error();
        }
        return vo;

    }

    @Override
    public ResponseVoo growPlayer(Integer playernum,Integer id) {

//        System.out.println("#######" +playernum);
//        System.out.println("########" + id);
        Greens greens = new Greens();
        greens.setPlayernum(playernum);
        greens.setId(id);
        ResponseVoo vo = new ResponseVoo<>();
        int i = greensMapper.updateByPrimaryKeySelective(greens);

        if(i>0) {
            vo = ResponseVoo.OK();
        } else {
            vo = ResponseVoo.error();
        }
        return vo;
    }

    @Override
    public ResponseVoo growColletnum(Integer colletnum, Integer id) {
        Greens greens = new Greens();
        greens.setColletnum(colletnum);
        greens.setId(id);
        int i = greensMapper.updateByPrimaryKeySelective(greens);
        ResponseVoo vo = new ResponseVoo<>();
        if(i>0) {
            vo = ResponseVoo.OK();
        } else {
            vo = ResponseVoo.error();
        }
        return vo;
    }

    @Override
    public ResponseVoo getGreurl() {

        List<Map<String, String>> greurl = greensMapper.getGreurl();
        ResponseVoo vo = new ResponseVoo<>();
        vo.setData(greurl);
        return vo;
    }

    @Override
    public ResponseVoo<Greens> weekgre() {

        List<Greens> greens = greensMapper.selectGre();
        ResponseVoo vo = new ResponseVoo<>();
        vo.setData(greens);
        return vo;
    }

    @Override
    public ResponseVoo getGreByTypename(String typename) {

        List<Map<String, Object>> maps = greensMapper.selectByTypename(typename);
        ResponseVoo vo = new ResponseVoo<>();
        vo.setData(maps);
        return vo;
    }
}
