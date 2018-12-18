package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.LikeMapper;
import com.qfedu.yikitchen.mapper.LookMapper;
import com.qfedu.yikitchen.pojo.Like;
import com.qfedu.yikitchen.service.LikeService;
import com.qfedu.yikitchen.util.ResultUtil;
import com.qfedu.yikitchen.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    private LikeMapper likeMapper;
    @Autowired
    private LookMapper lookMapper;



    @Override
    public ResultBean selectLike(Like like) {
        Like like1=likeMapper.likeOrNo(like);


        if (like1!=null){
            ResultBean resultBean = ResultUtil.execOp(likeMapper.delete(like),"点赞取消");
            return  resultBean;

        }else {
            ResultBean resultBean = ResultUtil.execOp(likeMapper.insert(like),"点赞成功");

            return  resultBean;
        }

    }



    @Override
    public ResultBean LikeNum() {

        ResultBean resultBean =ResultUtil.setOK("查找成功",likeMapper.LikeNum());
        return resultBean;
    }
}
