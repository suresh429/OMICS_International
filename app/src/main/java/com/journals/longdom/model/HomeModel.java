package com.journals.longdom.model;

public class HomeModel {
    private String category_name;
    private String category_url;

    public HomeModel() {
    }

    public HomeModel(String category_name, String category_url) {
        this.category_name = category_name;
        this.category_url = category_url;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_url() {
        return category_url;
    }

    public void setCategory_url(String category_url) {
        this.category_url = category_url;
    }
}
