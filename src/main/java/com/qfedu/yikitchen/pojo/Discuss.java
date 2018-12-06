package com.qfedu.yikitchen.pojo;

import java.util.Date;

public class Discuss {
    private Integer id;

    private Integer storyid;

    private Integer otheruserid;

    private String talk;

    private Date talktime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoryid() {
        return storyid;
    }

    public void setStoryid(Integer storyid) {
        this.storyid = storyid;
    }

    public Integer getOtheruserid() {
        return otheruserid;
    }

    public void setOtheruserid(Integer otheruserid) {
        this.otheruserid = otheruserid;
    }

    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk == null ? null : talk.trim();
    }

    public Date getTalktime() {
        return talktime;
    }

    public void setTalktime(Date talktime) {
        this.talktime = talktime;
    }
}