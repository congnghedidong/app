package com.nhc.cuongnguyen.trip;

/**
 * Created by PC on 3/20/2018.
 */

public class group {
    private int image;
    private String name_position;

    public group(int image, String name_position) {
        this.image = image;
        this.name_position = name_position;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName_position() {
        return name_position;
    }

    public void setName_position(String name_position) {
        this.name_position = name_position;
    }
}
