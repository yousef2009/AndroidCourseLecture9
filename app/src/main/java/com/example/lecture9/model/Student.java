package com.example.lecture9.model;

public class Student {
    private int ID;
    private String name;
    private String average;

    public Student(int ID, String name, String average) {
        this.ID = ID;
        this.name = name;
        this.average = average;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }
}
