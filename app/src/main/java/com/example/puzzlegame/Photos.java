package com.example.puzzlegame;

public class Photos {


    // Image name (Without extension)
    private String Photo;


    public Photos(String Photo) {
        this.Photo= Photo;

    }

    public String getFlagName() {
        return Photo;
    }

    public void setFlagName(String Photo) {
        this.Photo = Photo;
    }



}
