package com.acciojob.FirstRESTAPI;

public class User {
    private String name;
    private int age;
    private int userId;
    public User() { // This is also mandatory

    }

    public User(String name, int age, int userId) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
