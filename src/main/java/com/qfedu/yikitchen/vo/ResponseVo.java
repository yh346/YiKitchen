package com.qfedu.yikitchen.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class ResponseVo<T> {

    private int code;

    private String msg;

    private List<T> data;

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public static ResponseVo OK() {

        ResponseVo vo = new ResponseVo();

        vo.setMsg("success");
        vo.setCode(0);
        return vo;
    }

    public static ResponseVo error() {

        ResponseVo vo = new ResponseVo();

        vo.setMsg("error");
        vo.setCode(2000);
        return vo;
    }
}
