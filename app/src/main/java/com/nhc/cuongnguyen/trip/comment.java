package com.nhc.cuongnguyen.trip;

/**
 * Created by PC on 3/22/2018.
 */

public class comment {
    private int image_user ;
    private String name ;
    private String context;
    private String datetime;

    public comment(int image_user, String name, String context, String datetime) {
        this.image_user = image_user;
        this.name = name;
        this.context = context;
        this.datetime = datetime;
    }

    public int getImage_user() {
        return image_user;
    }

    public void setImage_user(int image_user) {
        this.image_user = image_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
