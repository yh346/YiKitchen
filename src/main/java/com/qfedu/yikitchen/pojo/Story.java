package com.qfedu.yikitchen.pojo;

import java.util.Date;
import java.util.List;

public class Story {
    private Integer id;

    private Integer uid;

    private Date createtime;

    private String content;

    private Integer looknum;

    private Integer playernum;

    private Integer likenum;

    private User user;

    private List<StoryImg> storyImgs;

    public Integer getLooknum() {
        return looknum;
    }

    public void setLooknum(Integer looknum) {
        this.looknum = looknum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<StoryImg> getStoryImgs() {
        return storyImgs;
    }

    public void setStoryImgs(List<StoryImg> storyImgs) {
        this.storyImgs = storyImgs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }



    public Integer getPlayernum() {
        return playernum;
    }

    public void setPlayernum(Integer playernum) {
        this.playernum = playernum;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }
}