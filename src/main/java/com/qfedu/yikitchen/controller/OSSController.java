package com.qfedu.yikitchen.controller;


import com.qfedu.yikitchen.constant.SystemCon;
import com.qfedu.yikitchen.pojo.StoryImg;
import com.qfedu.yikitchen.util.OSSUtil;
import com.qfedu.yikitchen.util.ResultUtil;
import com.qfedu.yikitchen.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/12/2 10:10
 */
@RestController
public class OSSController {

    @Autowired
    private OSSUtil ossUtil;
    //文件上传
    @PostMapping("ossupload.do")
    public ResultBean upload(MultipartFile[] file) throws IOException {
        List<String> path = new ArrayList<>();
       // String path=null;
        if(file.length>0){
            for (int i=0;i<file.length;i++){
                path.add(ossUtil.fileUp(file[i].getOriginalFilename(),file[i].getBytes()));

            }

           //String path=ossUtil.fileUp(file.getOriginalFilename(),file.getBytes());
            return ResultUtil.setOK("存储成功",path);
        }else{
            return ResultUtil.setError(SystemCon.RERROR1,"请选择上传文件",null);
        }
    }
}
