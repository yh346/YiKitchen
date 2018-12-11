package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.Look;
import com.qfedu.yikitchen.vo.ResultBean;

public interface LookService {
    ResultBean addLook(Look look);
    ResultBean selectNum(Integer id);
}
