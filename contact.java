package com.example.myapplication.Tuan3;

public class contact {
    private String avatar;
    private String name;
    private String phone;

    public contact(String avatar, String name, String phone) {
        this.avatar = avatar;
        this.name = name;
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
