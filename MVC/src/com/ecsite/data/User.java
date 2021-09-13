package com.ecsite.data;

public class User {
    private String userid;
    private String password;
    private String name;
    private String address;

    public String getUserid() {
        return userid;
    }

    public User setUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }
}
