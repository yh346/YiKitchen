package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.pojo.Dish;
import com.qfedu.yikitchen.pojo.Greens;
import com.qfedu.yikitchen.pojo.Step;
import com.qfedu.yikitchen.service.GreensService;
import com.qfedu.yikitchen.vo.ResponseVoo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜品接口
 */

@Api(description = "菜品所有接口")
@RestController
@RequestMapping("/greens")
public class GreensController {

    @Autowired
    private GreensService greensService;

    /**
     * 查询所有的菜品
     * @return
     */
    @ApiOperation(value="获取菜品", notes="获取菜品的用户名，照片路径，点击量，转发量")
    @RequestMapping(value = "/getAllGreens", method = RequestMethod.GET)
    //@RequestMapping("/getAllGreens")
    public ResponseVoo<Greens> getAllGreens() {

        ResponseVoo<Greens> vo = greensService.getAllGreens();
        if(vo.getData()!=null) {
            vo.setCode(1000);
            vo.setMsg("ok");
           return vo;
        } else {
            vo = ResponseVoo.error();
            return vo;
        }
    }

    /**
     * 根据菜品id查询出菜品的配料以及自作步骤
     * @param id
     * @return
     */
    @ApiOperation(value="通过菜品id获取菜品详细信息以及配料和制作步骤", notes="根据url的id来获取对应id详细信息")
    @ApiImplicitParam(name = "id", value = "菜品ID")
    @RequestMapping(value = "/getGreensById", method = RequestMethod.GET)
    //@RequestMapping("/getGreensById")
    public ResponseVoo<Greens> getGreensById(Integer id) {
        List<Greens> list = new ArrayList();
        Greens green = greensService.getGreensById(id);
        list.add(green);
        ResponseVoo vo = new ResponseVoo();
        vo.setData(list);
        if(vo.getData()!=null) {
            vo.setCode(1000);
            vo.setMsg("ok");
            return vo;
        } else {
            vo = ResponseVoo.error();
            return vo;
        }

    }

    /**
     * 通过菜品名进行模糊查询
     */
    @ApiOperation(value="通过输入关键字获取菜品", notes="根据url的grename来进行模糊查询")
    @ApiImplicitParam(name = "grename", value = "菜品名")
    @RequestMapping(value = "/getGreenByGrename", method = RequestMethod.GET)
    //@RequestMapping("/getGreenByGrename")
    public ResponseVoo<Greens> getGreenByGrename(String grename) {
        //System.out.println(grename);
        ResponseVoo<Greens> vo = greensService.getGreenByGrename(grename);
        if(vo.getData()!=null) {
            vo.setCode(1000);
            vo.setMsg("ok");
            return vo;
        } else {
            vo = ResponseVoo.error();
            return vo;
        }

    }

    /**
     * 菜谱的插入
     */

    @ApiOperation(value="菜谱上传", notes="")
    @ApiImplicitParam(name = "greens", value = "菜的详细信息")
    @RequestMapping(value = "/addGreens" ,method = RequestMethod.POST)
    public ResponseVoo addGreens(Greens greens, List<Step> steps, List<Dish> dishes) {

        ResponseVoo vo = greensService.addGreens(greens, steps, dishes);
        return vo;
    }

    @ApiOperation(value="观看量修改", notes="")
    @ApiImplicitParam(name = "playernum", value = "观看量加一后的数值")
    @RequestMapping( value = "/growPalyer",method = RequestMethod.GET)
    public ResponseVoo growPalyer(Integer playernum,Integer id) {

        ResponseVoo vo = greensService.growPlayer(playernum, id);
        return vo;
    }


    @ApiOperation(value="收藏量修改", notes="")
    @ApiImplicitParam(name = "colletnum", value = "收藏量加一后的数值")
    @RequestMapping( value = "/growColletnum",method = RequestMethod.GET)
    public ResponseVoo growColletnum(Integer colletnum,Integer id) {

        ResponseVoo vo = greensService.growColletnum(colletnum, id);

        return vo;
    }


    @ApiOperation(value="本周最佳", notes="")
    @RequestMapping(value = "/weekgre",method = RequestMethod.GET)
    public ResponseVoo<Greens> weekgre(){

        ResponseVoo<Greens> vo = greensService.weekgre();
        return vo;
    }

    @ApiOperation(value="根据菜品类型名查询", notes="")
    @RequestMapping(value = "/getGreByTypename",method = RequestMethod.GET)
    public ResponseVoo getGreByTypename(String typename){

        //System.out.println(typename);
        ResponseVoo vo = greensService.getGreByTypename(typename);

        return  vo;
    }
}
