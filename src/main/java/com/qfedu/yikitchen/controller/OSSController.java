package com.qfedu.yikitchen.controller;


import com.qfedu.yikitchen.constant.SystemCon;

import com.qfedu.yikitchen.pojo.StoryImg;
import com.qfedu.yikitchen.service.StoryImgService;
import com.qfedu.yikitchen.util.OSSUtil;
import com.qfedu.yikitchen.util.ResultUtil;
import com.qfedu.yikitchen.vo.ResultBean;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


 //@Author feri
 //@Date Created in 2018/12/2 10:10


@RestController
@Api(value = "ji接口" )
public class OSSController {

    @Autowired
    private OSSUtil ossUtil;
    @Autowired
    private StoryImgService storyImgService;
    //文件上传
    @PostMapping("upload")
    public ResultBean upload(MultipartFile[] file , HttpServletResponse response,Integer storyid)  {
        response.addHeader("Access-Control-Allow-Origin", "*");
        OSSUtil ossUtil = new OSSUtil("oss-cn-beijing.aliyuncs.com","LTAIVx1oizHaw5Iz",
                "X1SlkDu0eYShwW41hLw20y61xVDgbC","nwh1995");
        List<String> path=new ArrayList<>();
        if(!file[0].isEmpty()){
            //String path= null;
            try {
                List<StoryImg> storyImgs = new ArrayList<StoryImg>();
                for (int i=0;i<file.length;i++){
                    path.add(ossUtil.fileUp(file[i].getOriginalFilename(),file[i].getBytes()))  ;
                    StoryImg si=new StoryImg();
                    si.setUrl(path.toString());
                    System.out.println(path);
                    si.setStoryid(storyid);
                    System.out.println(storyid);
                    storyImgs.add(si);
                }
                ResultBean resultBean= ResultUtil.setOK("存储成功",path);

                if (resultBean.getMsg().equals("存储成功")){
                    return  ResultUtil.execOp(storyImgService.inserts(storyImgs),"上传成功");
                    /*return storyImgService.insert(storyImg1);*/
                }else {
                    return ResultUtil.setError(SystemCon.RERROR1,"上传失败",null);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return ResultUtil.setError(SystemCon.RERROR1,"上传失败",null);
            }

        }else{
            return ResultUtil.setError(SystemCon.RERROR1,"请选择上传文件",null);
        }

    }
}

