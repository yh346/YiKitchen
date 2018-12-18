package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.LookMapper;
import com.qfedu.yikitchen.pojo.Look;
import com.qfedu.yikitchen.service.LookService;
import com.qfedu.yikitchen.util.ResultUtil;
import com.qfedu.yikitchen.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LookServiceImpl implements LookService {

    @Autowired
    private LookMapper lookMapper;
    @Override
    public ResultBean addLook(Look look) {
        ResultBean resultBean = ResultUtil.setOK("添加成功",lookMapper.insert(look));
        return resultBean;
    }

    @Override
    public ResultBean selectNum() {
        ResultBean resultBean =ResultUtil.setOK("查找成功",lookMapper.LooksNum());
        return resultBean;
    }
}
