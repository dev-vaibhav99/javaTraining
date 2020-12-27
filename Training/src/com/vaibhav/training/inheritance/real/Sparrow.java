package com.vaibhav.training.inheritance.real;

public class Sparrow extends Birds implements CanFly{
    public Sparrow(int age, int weight) {
        super(age, weight);
    }

    // the Sparrow class is derived from Birds class
    // so it has all the properties of Birds class and eventually Animal class also


    // as sparrow class has implemented the interface CanFly so this class specifically can use its properties
    // in our case it is flying ability
    @Override
    public void fly() {
        System.out.println("Sparrow can fly very well...");
    }


    // these properties are of Animal class but due to Multilevel inheritance it is able to use those properties
    @Override
    public void eat() {
        System.out.println("Sparrow eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow sleeping...");
    }
}
