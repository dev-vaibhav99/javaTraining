package com.vaibhav.training.inheritance.real;

public class Zoo {

    public static void main(String[] args) {

        Animal tiger = new Animal();
        tiger.eat();
        tiger.sleep();
        System.out.println(" ");

        Chicken chicken = new Chicken(12,2);
        chicken.eat();
        chicken.sleep();
        System.out.println(" ");

        Sparrow sparrow = new Sparrow(9, 1);
        sparrow.fly();
        sparrow.eat();
        sparrow.sleep();
    }
}
