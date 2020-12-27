package com.vaibhav.training.inheritance.standard;

public class Derived extends Base {

    String address;

    public Derived(String name, int age, String gender, String address) {
        super(name, age, gender);
        this.address = address;
    }

    public Derived(){

    }

    public static void main(String[] args) {
        Derived derivedClass = new Derived("Sheru", 1, "Male", "Sultanpur");
        System.out.println(derivedClass.getName());
        System.out.println(derivedClass.address);

        Base baseClass = new Base("Vaibhav", 20, "male");

        //feeding the info using setter methods
        baseClass.setName("Samadhan");
        baseClass.setAge(43);
        baseClass.setGender("Male");

        //getting info using getter methods
        System.out.println("Name: "+ baseClass.getName());
        System.out.println("Age: "+baseClass.getAge());
        System.out.println("Gender: "+baseClass.getGender());
    }

}
