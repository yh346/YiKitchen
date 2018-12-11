package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.Discuss;
import com.qfedu.yikitchen.vo.ResultBean;

public interface DiscussService {
    ResultBean selectDiscuss(Integer id);
    ResultBean addDiscuss(Discuss discuss);
}
