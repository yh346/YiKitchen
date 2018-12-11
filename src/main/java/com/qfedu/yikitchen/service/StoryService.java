package com.qfedu.yikitchen.service;

import com.qfedu.yikitchen.pojo.Story;
import com.qfedu.yikitchen.vo.ResponseVo;
import com.qfedu.yikitchen.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.ws.Response;
import java.io.IOException;

public interface StoryService {

    ResultBean selectFocus(Integer id);

    ResultBean selectAllStory();

    ResultBean ByTime();

    ResultBean addStory(String content, MultipartFile[] multipartFiles,Integer userid) throws IOException;

     ResultBean newStorys(String content, String[] srcs, Integer userid);
}
