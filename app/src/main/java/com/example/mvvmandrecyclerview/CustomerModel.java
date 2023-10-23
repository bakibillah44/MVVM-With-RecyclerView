package com.example.mvvmandrecyclerview;

public class CustomerModel {
    int img;
    String name;
    String phone;

    public CustomerModel(int img, String name, String phone) {
        this.img = img;
        this.name = name;
        this.phone = phone;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }


}
