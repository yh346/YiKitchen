package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.FocusMapper;
import com.qfedu.yikitchen.pojo.Focus;
import com.qfedu.yikitchen.pojo.Like;
import com.qfedu.yikitchen.service.FocusService;
import com.qfedu.yikitchen.util.ResultUtil;
import com.qfedu.yikitchen.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FocusServiceImpl implements FocusService {
    @Autowired
    private FocusMapper focusMapper;

    @Override
    public ResultBean FocusOrNo(Focus focus) {
       Focus focus1=focusMapper.FocusOrNo(focus);
    if (focus1!=null){
        ResultBean resultBean = ResultUtil.execOp(focusMapper.delete(focus),"已取消关注");
        return  resultBean;
        }else{
        ResultBean resultBean = ResultUtil.execOp(focusMapper.insert(focus),"关注成功");
        return  resultBean;
        }

    }
}
