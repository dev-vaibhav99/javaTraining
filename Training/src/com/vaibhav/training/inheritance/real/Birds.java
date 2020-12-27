package com.vaibhav.training.inheritance.real;

public class Birds extends Animal{

    // Birds class is derived class of Animal class
    // it inherits all the properties of its base class
    // and it also have its own properties too

    int age, weight;

    public Birds(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }
}
