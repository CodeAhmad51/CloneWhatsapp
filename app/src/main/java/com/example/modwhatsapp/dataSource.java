package com.example.modwhatsapp;

public class dataSource {
    int time;
    String name;
    int imageId;

    public dataSource() {

    }

    public dataSource(int time, String name, int imageId) {
        this.time = time;
        this.name = name;
        this.imageId = imageId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
