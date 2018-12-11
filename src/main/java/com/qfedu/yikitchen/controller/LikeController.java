package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.pojo.Focus;
import com.qfedu.yikitchen.pojo.Like;
import com.qfedu.yikitchen.service.FocusService;
import com.qfedu.yikitchen.service.LikeService;
import com.qfedu.yikitchen.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "点赞接口")
public class LikeController {
    @Autowired
    private LikeService likeService;

    @ApiOperation(value = "查询点赞与否",httpMethod = "GET",notes = "获取点赞结果")
    @RequestMapping("selectLike")
    public ResultBean selectLike(Like like){
        return likeService.selectLike(like);
    }
    @ApiOperation(value = "添加点赞",httpMethod = "GET",notes = "点赞别人")
    @RequestMapping("addLike")
    public ResultBean addLike(Like like){
        return likeService.addLike(like);
    }
    @ApiOperation(value = "取消点赞",httpMethod = "GET",notes = "取消点赞")
    @RequestMapping("deleteLike")
    public ResultBean deleteLike(Like like){
        return likeService.deleteLike(like);
    }
    @ApiOperation(value = "查询点赞数",httpMethod = "GET",notes = "获取点赞数")
    @RequestMapping("LikeNum")
    public ResultBean LikeNum(Integer id){
        return likeService.LikeNum(id);
    }

}
