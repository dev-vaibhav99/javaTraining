package com.vaibhav.training.oop;

public class Earth {

    public static void main(String[] args) {

        Human human1 = new Human("John Doe","brown","sweet","boy",30,50);
        Human human2 = new Human("Peter Parkour","blue","impulsive","boy",19,53);
        human1.speak();
        human1.aboutYourself();
        System.out.println("\n");
        human2.speak();
        human2.aboutYourself();
    }
}
