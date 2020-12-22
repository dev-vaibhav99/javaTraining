package com.vaibhav.training.oop;

public class Earth {

    public static void main(String[] args) {

        Human human = new Human("boy","angry");
        human.name = "John Doe";
        human.age = 30;
        human.heightInInches = 50;
        human.eyeColor = "green";

        human.speak();
        human.aboutYourself();
        human.eat();
        human.walking();
        human.sleeping();
    }
}
