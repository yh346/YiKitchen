package com.qfedu.yikitchen.pojo;

public class Dish {
    private Integer id;

    private Integer greensid;

    private String dishname;

    private String dishweight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGreensid() {
        return greensid;
    }

    public void setGreensid(Integer greensid) {
        this.greensid = greensid;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname == null ? null : dishname.trim();
    }

    public String getDishweight() {
        return dishweight;
    }

    public void setDishweight(String dishweight) {
        this.dishweight = dishweight == null ? null : dishweight.trim();
    }
}