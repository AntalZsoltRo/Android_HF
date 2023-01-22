package com.example.pizza;

import java.io.Serializable;

public class Pizza implements Serializable {
    private String name;
    private int price;
    private int image;
    private int number;
    private int imageId;
    private String info;

    public Pizza(String name, int price, int image, String info) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.info = info;
        this.number = 0;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public String getName() {

        return name;
    }

    public int getPrice() {

        return price;
    }

    public int getImage() {

        return image;
    }

    public int getNumber() {

        return number;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getInfo() {
        return info;
    }
}
