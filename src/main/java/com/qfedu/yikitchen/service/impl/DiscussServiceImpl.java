package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.DiscussMapper;
import com.qfedu.yikitchen.pojo.Discuss;
import com.qfedu.yikitchen.service.DiscussService;
import com.qfedu.yikitchen.util.ResultUtil;
import com.qfedu.yikitchen.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussServiceImpl implements DiscussService {
    @Autowired
    private DiscussMapper discussMapper;


    @Override
    public ResultBean selectDiscuss(Integer id) {
      List<Discuss> discusses = discussMapper.selectDiscuss(id);
        System.out.println(discusses);
        ResultBean resultBean = ResultUtil.setOK("查询成功",discussMapper.selectDiscuss(id));
        return resultBean;
    }

    @Override
    public ResultBean addDiscuss(Discuss discuss) {
        ResultBean resultBean = ResultUtil.execOp(discussMapper.insertSelective(discuss),"评论成功");
        return resultBean;
    }
}
