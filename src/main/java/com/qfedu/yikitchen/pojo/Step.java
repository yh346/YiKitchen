package com.qfedu.yikitchen.pojo;

public class Step {
    private Integer id;

    private Integer greensid;

    private String stepname;

    private String stepurl;

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

    public String getStepname() {
        return stepname;
    }

    public void setStepname(String stepname) {
        this.stepname = stepname == null ? null : stepname.trim();
    }

    public String getStepurl() {
        return stepurl;
    }

    public void setStepurl(String stepurl) {
        this.stepurl = stepurl == null ? null : stepurl.trim();
    }
}