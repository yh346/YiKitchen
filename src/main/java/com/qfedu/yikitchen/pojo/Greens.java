package com.qfedu.yikitchen.pojo;

import java.util.List;

public class Greens {
    private Integer id;

    private String grename;

    private Integer userid;

    private Integer colletnum;

    private Integer playernum;

    private String greurl;

    private String time;

    private String difflevel;
	
	private String story;

    private String dish;

    private String step;

    private Integer gretypeid;

    private String typename;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getGretypeid() {
        return gretypeid;
    }

    public void setGretypeid(Integer gretypeid) {
        this.gretypeid = gretypeid;
    }

    //用户名
    private String username;

    private List<Dish> dishes;

    private List<Step> steps;

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrename() {
        return grename;
    }

    public void setGrename(String grename) {
        this.grename = grename == null ? null : grename.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getColletnum() {
        return colletnum;
    }

    public void setColletnum(Integer colletnum) {
        this.colletnum = colletnum;
    }

    public Integer getPlayernum() {
        return playernum;
    }

    public void setPlayernum(Integer playernum) {
        this.playernum = playernum;
    }

    public String getGreurl() {
        return greurl;
    }

    public void setGreurl(String greurl) {
        this.greurl = greurl == null ? null : greurl.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getDifflevel() {
        return difflevel;
    }

    public void setDifflevel(String difflevel) {
        this.difflevel = difflevel == null ? null : difflevel.trim();
    }
	public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story == null ? null : story.trim();
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish == null ? null : dish.trim();
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step == null ? null : step.trim();
    }
}