package com.vaibhav.training.inheritance.real;

public class Chicken extends Birds {

    public Chicken(int chickenAge, int chickenWeight) {
        super(chickenAge, chickenWeight);
    }

    // as Chicken cannot fly so this class has not implemented the interface CanFly ***

    // and due to Multilevel inheritance it is able to use properties of Animal class
    @Override
    public void eat() {
        System.out.println("Chicken eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Chicken sleeping...");
    }
}
