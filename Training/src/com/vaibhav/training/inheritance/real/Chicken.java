package com.vaibhav.training.inheritance.real;

public class Chicken extends Birds {

    public Chicken(int chickenAge, int chickenWeight) {
        super(chickenAge, chickenWeight);
    }


    @Override
    public void eat() {
        System.out.println("Chicken eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Chicken sleeping...");
    }
}
