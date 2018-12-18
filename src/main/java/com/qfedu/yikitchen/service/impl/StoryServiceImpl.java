package com.qfedu.yikitchen.service.impl;

import com.qfedu.yikitchen.mapper.LikeMapper;
import com.qfedu.yikitchen.mapper.LookMapper;
import com.qfedu.yikitchen.mapper.StoryImgMapper;
import com.qfedu.yikitchen.mapper.StoryMapper;
import com.qfedu.yikitchen.pojo.Like;
import com.qfedu.yikitchen.pojo.Look;
import com.qfedu.yikitchen.pojo.Story;
import com.qfedu.yikitchen.pojo.StoryImg;
import com.qfedu.yikitchen.service.StoryService;
import com.qfedu.yikitchen.util.EcStoryUtil;
import com.qfedu.yikitchen.util.ResultUtil;
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

    @Autowired
    private LikeMapper likeMapper;
    @Autowired
    private LookMapper lookMapper;
@Autowired
private EcStoryUtil ecStoryUtil;

    @Override
    public ResultBean selectFocus(Integer id) {
       List<Story> stories =storyMapper.selectFocus(id);
        List<Like> likes=likeMapper.LikeNum();
        List<Look> looks=lookMapper.LooksNum();
       ResultBean resultBean= ResultUtil.setOK("success",ecStoryUtil.getStory(stories,null,looks,likes));
       return  resultBean;
    }

    @Override
    public ResultBean selectAllStory() {
        List<Story> stories =storyMapper.selectAllStory();

        List<Like> likes=likeMapper.LikeNum();
        List<Look> looks=lookMapper.LooksNum();


        ResultBean resultBean= ResultUtil.setOK("success",ecStoryUtil.getStory(stories,null,looks,likes));
        return  resultBean;
    }

    @Override
    public ResultBean ByTime() {
        System.out.println("11111");
        List<Story> stories =storyMapper.selectStoryByTime();
        System.out.println("123456");
        List<Like> likes=likeMapper.LikeNum();
        List<Look> looks=lookMapper.LooksNum();
        ResultBean resultBean= ResultUtil.setOK("success",ecStoryUtil.getStory(stories,null,looks,likes));
        return  resultBean;
    }

    @Override
    public ResultBean addStory(String content, MultipartFile[] multipartFiles, Integer userid)  {
        System.out.println("22222");
        ResultBean  rb  = new ResultBean();
        Story story = new Story();
        story.setUid(userid);
        story.setContent(content);
       storyMapper.insert(story);
        List<StoryImg> storyImgs=new ArrayList<StoryImg>();
        for (int i = 0;i< multipartFiles.length;i++){
           /* if(request instanceof MultipartHttpServletRequest){

            }*/
            String img= System.currentTimeMillis() +Math.random()*100+multipartFiles[i].getOriginalFilename();
            File file=new File("D:\\xiaomi\\" + img);
            try {
                multipartFiles[i].transferTo(file);
                StoryImg si = new StoryImg();
                si.setUrl(img);
                si.setStoryid(story.getId());
                storyImgs.add(si);
              ResultBean resultBean=ResultUtil.execOp(storyImgMapper.inserts(storyImgs),"发表成功");
            return resultBean;
            } catch (IOException e) {
                e.printStackTrace();
                ResultBean resultBean=ResultUtil.execOp(storyImgMapper.inserts(storyImgs),"发表失败");
                return resultBean;
            }

        }

            //ResultBean resultBean =ResultUtil.execOp( storyMapper.insert(story),"发表成功");

      return rb;
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
