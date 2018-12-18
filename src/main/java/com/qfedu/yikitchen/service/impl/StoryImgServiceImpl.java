package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.StoryImgMapper;
import com.qfedu.yikitchen.pojo.StoryImg;
import com.qfedu.yikitchen.service.StoryImgService;
import com.qfedu.yikitchen.util.ResultUtil;
import com.qfedu.yikitchen.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryImgServiceImpl implements StoryImgService {
    @Autowired
    private StoryImgMapper storyImgMapper;


    @Override
    public int insert(StoryImg storyImg) {
        return storyImgMapper.insertSelective(storyImg);
        /*ResultBean resultBean = ResultUtil.execOp(storyImgMapper.insertSelective(storyImg),"上传成功");
        return resultBean;*/

    }

    @Override
    public int inserts(List<StoryImg> storyImgs) {
        return storyImgMapper.inserts(storyImgs);
    }
}
