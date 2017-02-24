package com.xterstar.www.placeholder;

/**
 * Created by issacholguin1 on 2/23/17.
 */

public class Blog {

    private String title, desc;

    public Blog() {

    }

    public Blog(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
