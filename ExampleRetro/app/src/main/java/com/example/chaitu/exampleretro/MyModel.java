package com.example.chaitu.exampleretro;

public class MyModel {
    String title,link;

    public String getTitle() {//alt+insert select getters ( ctrl + a )
        return title;
    }

    public String getLink() {
        return link;
    }

    public MyModel(String title, String link) {//alt+insert constructor ( ctrl + a )
        this.title = title;
        this.link = link;
    }
}
