package com.nhc.cuongnguyen.trip;

/**
 * Created by PC on 3/20/2018.
 */

public class Notifi {
    private int image_Notifi;
    private String notifi;

    public Notifi(int image_Notifi, String notifi) {
        this.image_Notifi = image_Notifi;
        this.notifi = notifi;
    }

    public int getImage_Notifi() {
        return image_Notifi;
    }

    public void setImage_Notifi(int image_Notifi) {
        this.image_Notifi = image_Notifi;
    }

    public String getNotifi() {
        return notifi;
    }

    public void setNotifi(String notifi) {
        this.notifi = notifi;
    }
}
