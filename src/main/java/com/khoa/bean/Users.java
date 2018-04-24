package com.khoa.bean;

import org.springframework.stereotype.Component;

@Component("user2")
public class Users {
    private String name;
    private int age;
    private String email;
    private String address;

    public Users(){
        this.name = "datnt";
        this.age = 26;
        this.email = "datnt@gmail.com";
        this.address = "Ha Noi";
    }

    public Users(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
