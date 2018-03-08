package com.nhc.cuongnguyen.trip;

/**
 * Created by PC on 3/4/2018.
 */

public class ThongTin {

    private String nameUser;
    private String namePosition;
    private int imageUser;
    private int imagePosition;
    private float rate;

    public ThongTin(String nameUser, String namePosition, int imageUser, int imagePosition, float rate) {
        this.nameUser = nameUser;
        this.namePosition = namePosition;
        this.imageUser = imageUser;
        this.imagePosition = imagePosition;
        this.rate = rate;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public int getImageUser() {
        return imageUser;
    }

    public void setImageUser(int imageUser) {
        this.imageUser = imageUser;
    }

    public int getImagePosition() {
        return imagePosition;
    }

    public void setImagePosition(int imagePosition) {
        this.imagePosition = imagePosition;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
