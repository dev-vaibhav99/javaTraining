package com.vaibhav.training.inheritance.standard;

public class Base {
    private String name;
    private int age;
    private String gender;

    // default constructor
    public Base(){

    }

    // parameterized constructor
    public Base(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // these are setter methods.. use to set values to private fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    // these are getter methods.. use to get the values of private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
