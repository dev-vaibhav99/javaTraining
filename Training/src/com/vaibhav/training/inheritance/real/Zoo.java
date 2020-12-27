package com.vaibhav.training.inheritance.real;

public class Zoo {

    // We are creating a Multilevel inheritance.
    // it looks like { Animal -> Birds -> Sparrow, Chicken }

    public static void main(String[] args) {

        Animal animal = new Animal(); // this is the base class
        animal.eat();
        animal.sleep();
        System.out.println(" ");

        // Chicken class has NOT implemented CanFly interface so it is NOT able to use it
        Chicken chicken = new Chicken(12,2);
        chicken.eat();
        chicken.sleep();
        System.out.println(" ");

        // Sparrow class has implemented CanFly interface that's why it is able to use that
        Sparrow sparrow = new Sparrow(9, 1);
        sparrow.fly();  // this is overridden method of CanFly interface
        sparrow.eat();
        sparrow.sleep();
    }
}
