package com.qfedu.yikitchen.controller;

import com.qfedu.yikitchen.service.StoryService;
import com.qfedu.yikitchen.util.ResultUtil;
import com.qfedu.yikitchen.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@Api(value = "故事接口")
public class StoryController {
    @Autowired
    private StoryService storyService;

    @ApiOperation(value = "获取关注对象的故事",httpMethod = "GET",notes = "获取所有关注故事")
    @RequestMapping("showFocus")
    public ResultBean showFocus(Integer id){
        return storyService.selectFocus(id);
    }
    @ApiOperation(value = "获取所有的故事",httpMethod = "GET",notes = "获取所有故事")
    @RequestMapping("showAllStory")
    public ResultBean showAllStory(){
        return storyService.selectAllStory();
    }
    @ApiOperation(value = "获取最新的故事",httpMethod = "GET",notes = "获取最新故事")
    @RequestMapping("showByTime")
    public ResultBean showByTime(){
        return storyService.ByTime();
    }
    @ApiOperation(value = "发表故事",httpMethod = "POST",notes = "发表最新故事")
    @RequestMapping("addStory")
    public ResultBean addStory(String content, @RequestParam("storyImgs") MultipartFile[] multipartFile, Integer userid, HttpServletResponse response) throws IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");
      return storyService.addStory(content,multipartFile,userid);

    }
    @ApiOperation(value = "上传",httpMethod = "POST",notes = "上传图片")
    @RequestMapping("uploadFile")
    public ResultBean upoadFile(HttpServletResponse response,
                                @RequestParam("file") MultipartFile multipartFile) throws IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");
        // 解决ie浏览器下的Bug

        String fileName = UUID.randomUUID().toString() + multipartFile.getOriginalFilename();
        File file = new File("D:\\xiaomi\\" + fileName);

        multipartFile.transferTo(file);
       ResultBean resultBean= ResultUtil.setOK("上传成功",null);

        // 将文件的名字或者文件的路径在返回给前端，前端获取到之后保存到隐藏表单域中，和其他的文本第二次提交的时候一起保存到数据库
        return resultBean;

    }
    @ApiOperation(value = "发表故",httpMethod = "GET",notes = "发表新故事")
    @RequestMapping("addStorys")
    public ResultBean addStorys(String content, String[] filename, Integer userid, HttpServletResponse response) throws IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");
        return storyService.newStorys(content,filename,userid);

    }



}
