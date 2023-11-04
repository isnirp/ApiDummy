package com.commons.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/*
* A Student buys or enrolls in courses
* */

@JsonIgnoreProperties
public class Student {
    private long id;
    private String name;
    private int age;
    private List<Course> courses;

    public Student() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
