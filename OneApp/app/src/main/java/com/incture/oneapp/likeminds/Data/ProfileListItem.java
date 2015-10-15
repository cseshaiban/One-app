package com.incture.oneapp.likeminds.Data;

/**
 * Created by Arjun on 05-09-2015.
 */
public class ProfileListItem {

    String data, title;

    public ProfileListItem(String data, String title)
    {
        this.title = title;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
