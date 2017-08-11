package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends UniversityPerson {
    private List<Human> children = new ArrayList<>();
    private int numberOfStudents;


    public Teacher(String name, int age, int numberOfStudents) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.numberOfStudents = numberOfStudents;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }



    public void teach() {
    }





    @Override
    public void live() {
        teach();
    }

    @Override
    public String getPosition() {
        return "Преподаватель";
    }
}