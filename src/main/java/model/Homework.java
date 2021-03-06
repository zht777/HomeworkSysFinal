package model;

import java.util.Date;

public class Homework {
    private int id;
    private String title;
    private String content;
    private Date createTime;
    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHomeworkTitle() {
        return title;
    }

    public void setHomeworkTitle(String title) { this.title = title; }

    public String getHomeworkContent() {
        return content;
    }

    public void setHomeworkContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
