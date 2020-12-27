package com.vaibhav.training.inheritance.real;

public class Sparrow extends Birds implements CanFly{
    public Sparrow(int age, int weight) {
        super(age, weight);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow can fly very well...");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow sleeping...");
    }
}
