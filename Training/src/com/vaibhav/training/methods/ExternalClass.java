package com.vaibhav.training.methods;

public class ExternalClass {
    public static void externalMethod(){
        System.out.println("This is external method.. Present in External Class.");
    }

    public void nonStatic(){
        System.out.println("I'm a non-static method.. you need an obj of the class to call me!");
    }

}
