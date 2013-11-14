package com.example.myandroid.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: arman.d
 * Date: 14/11/13
 * Time: 09:29
 * To change this template use File | Settings | File Templates.
 */
public class Section {
    private String title;
    private List<SectionItem> sectionItems = new ArrayList<SectionItem>();

    public Section(String title) {
        this.title = title;
    }

    public void addSectionItem(long id, String title, String icon) {
        this.sectionItems.add( new SectionItem(id, title, icon));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SectionItem> getSectionItems() {
        return sectionItems;
    }

    public void setSectionItems(List<SectionItem> sectionItems) {
        this.sectionItems = sectionItems;
    }
}
