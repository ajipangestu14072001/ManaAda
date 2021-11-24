package com.example.manaada.model;

public class Shop {
    private String title, subTitle, description;
    private int image, background, decoration, titlecolor;

    public Shop(String title, String subTitle, String description, int image, int background, int decoration, int titlecolor) {
        this.title = title;
        this.subTitle = subTitle;
        this.description = description;
        this.image = image;
        this.background = background;
        this.decoration = decoration;
        this.titlecolor = titlecolor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public int getDecoration() {
        return decoration;
    }

    public void setDecoration(int decoration) {
        this.decoration = decoration;
    }

    public int getTitlecolor() {
        return titlecolor;
    }

    public void setTitlecolor(int titlecolor) {
        this.titlecolor = titlecolor;
    }
}
