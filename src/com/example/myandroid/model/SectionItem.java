package com.example.myandroid.model;

/**
 * Created with IntelliJ IDEA.
 * User: arman.d
 * Date: 14/11/13
 * Time: 09:29
 * To change this template use File | Settings | File Templates.
 */
public class SectionItem {

    private long id;
    private String title;
    private String icon;

    public SectionItem(long id, String title, String icon) {
        this.id = id;
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
