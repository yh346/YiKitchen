package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.constant.SystemCon;
import com.qfedu.yikitchen.mapper.StoryImgMapper;
import com.qfedu.yikitchen.mapper.StoryMapper;
import com.qfedu.yikitchen.pojo.Story;
import com.qfedu.yikitchen.pojo.StoryImg;
import com.qfedu.yikitchen.service.StoryService;
import com.qfedu.yikitchen.util.ResultUtil;
import com.qfedu.yikitchen.vo.ResponseVo;
import com.qfedu.yikitchen.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StoryServiceImpl implements StoryService {
    @Autowired
    private StoryMapper storyMapper;
    @Autowired
    private StoryImgMapper storyImgMapper;


    @Override
    public ResultBean selectFocus(Integer id) {
       List<Story> stories =storyMapper.selectFocus(id);
       ResultBean resultBean= ResultUtil.setOK("success",stories);
       return  resultBean;
    }

    @Override
    public ResultBean selectAllStory() {
        List<Story> stories =storyMapper.selectAllStory();
        ResultBean resultBean= ResultUtil.setOK("success",stories);
        return  resultBean;
    }

    @Override
    public ResultBean ByTime() {
        List<Story> stories =storyMapper.selectStoryByTime();
        ResultBean resultBean= ResultUtil.setOK("success",stories);
        return  resultBean;
    }

    @Override
    public ResultBean addStory(String content, MultipartFile[] multipartFiles, Integer userid) throws IOException {

        Story story = new Story();
        story.setUid(userid);
        story.setContent(content);
       storyMapper.insert(story);
        List<StoryImg> storyImgs=new ArrayList<StoryImg>();
        for (int i = 0;i< multipartFiles.length;i++){
            String img= System.currentTimeMillis() +Math.random()*100+multipartFiles[i].getOriginalFilename();
            File file=new File("D:\\xiaomi\\" + img);
            multipartFiles[i].transferTo(file);
            StoryImg si = new StoryImg();
            si.setUrl(img);
            si.setStoryid(story.getId());
            storyImgs.add(si);
        }
        storyImgMapper.inserts(storyImgs);
            ResultBean resultBean =ResultUtil.execOp( storyMapper.insert(story),"发表成功");

      return resultBean;
    }

    @Override
    public ResultBean newStorys(String content, String[] srcs, Integer userid) {
        Story story = new Story();
        story.setUid(userid);
        story.setContent(content);
        storyMapper.insert(story);

        List<StoryImg> storyImgs = new ArrayList<StoryImg>();


        for(String src:srcs){
            StoryImg si=new StoryImg();
            si.setUrl(src);
            si.setStoryid(story.getId());
            storyImgs.add(si);
        }
        storyImgMapper.inserts(storyImgs);
        ResultBean resultBean =ResultUtil.execOp( storyMapper.insert(story),"发表成功");

        return resultBean;
    }


}
