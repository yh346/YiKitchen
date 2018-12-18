package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.StoryImg;
import com.qfedu.yikitchen.vo.ResultBean;

import java.util.List;

public interface StoryImgService {

    int insert(StoryImg storyImg);

    int inserts(List<StoryImg> storyImgs);

}
