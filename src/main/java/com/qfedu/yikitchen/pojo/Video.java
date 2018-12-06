package com.qfedu.yikitchen.pojo;

import java.util.Date;

public class Video {
    private Integer id;

    private String url;

    private String desc;

    private Integer sid;

    private Integer collectnum;

    private Integer playernum;

    private Date createtime;

    private Integer fitnessid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCollectnum() {
        return collectnum;
    }

    public void setCollectnum(Integer collectnum) {
        this.collectnum = collectnum;
    }

    public Integer getPlayernum() {
        return playernum;
    }

    public void setPlayernum(Integer playernum) {
        this.playernum = playernum;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getFitnessid() {
        return fitnessid;
    }

    public void setFitnessid(Integer fitnessid) {
        this.fitnessid = fitnessid;
    }
}