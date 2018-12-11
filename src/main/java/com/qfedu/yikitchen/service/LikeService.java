package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.Like;
import com.qfedu.yikitchen.vo.ResultBean;

public interface LikeService {
    ResultBean selectLike(Like like);
    ResultBean addLike(Like like);
    ResultBean deleteLike(Like like);

    ResultBean LikeNum(Integer id);
}
