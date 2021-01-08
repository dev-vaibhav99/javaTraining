package com.vaibhav.training.oopconcept;

public class Human {

    String name, eyeColor, nature, gender;
    int age, heightInInches;

    public Human(String name, String eyeColor, String nature, String gender, int age, int heightInInches) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.nature = nature;
        this.gender = gender;
        this.age = age;
        this.heightInInches = heightInInches;
    }

    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am "+age+" years old.");
        System.out.println("I am " + heightInInches +" inches tall.");
        System.out.println("My eyes are "+eyeColor+" coloured.");
    }

    public void aboutYourself(){
        System.out.println("I am a " + gender + " and my nature is " + nature);
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void walking(){
        System.out.println("walking...");
    }

    public void sleeping(){
        System.out.println("sleeping... zzz");
    }
}
