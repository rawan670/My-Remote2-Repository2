package com.mohanadalkrunz99.myapplication;

public class Student {

    String id ;
    String name ;
    String level;
    float avg;


    public Student(String id, String name, String level, float avg) {
        this.id = id;
        this.name = name;
        this.level= level;
        this.avg = avg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg= avg;
    }
}
