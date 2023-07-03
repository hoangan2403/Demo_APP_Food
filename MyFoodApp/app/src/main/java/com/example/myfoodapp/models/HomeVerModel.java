package com.example.myfoodapp.models;

public class HomeVerModel {

    int image;
    String name;
    String title;
    String like;

    public HomeVerModel(int image, String name, String title, String like) {
        this.image = image;
        this.name = name;
        this.title = title;
        this.like = like;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
