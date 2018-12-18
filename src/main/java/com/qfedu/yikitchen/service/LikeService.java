package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.Like;
import com.qfedu.yikitchen.vo.ResultBean;

public interface LikeService {
    ResultBean selectLike(Like like);


    ResultBean LikeNum();
}
