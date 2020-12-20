package com.vaibhav.training.methods;

public class MainClass {

    public static void main(String[] args) {
        internalMethod(); // method present in same class is called directly without className
        ExternalClass.externalMethod(); // method in another class should be called with className.functionName format

        int result = sum(10,20); // sum() is returning sum of two numbers.. storing in result
        System.out.println(result);

        invisible(); // this private method is only accessible in this class

        ExternalClass object = new ExternalClass();
        object.nonStatic(); // to call a non-static method we need an object of class
    }

    public static void internalMethod(){
        System.out.println("This is internal method.. which is present in Main Class.");
    }

    private static void invisible(){ // private methods are only accessible within the same class
        System.out.println("Hello, other classes can't see me !");
    }

    public static int sum(int num1,int num2){ // method returning int value to the main method
        return num1+num2;
    }

    /* SOME IMPORTANT POINTS :
    * void method does not return anything
    * fruitful method do return some value of specified data type
    * a private class is only accessible in the same package
    * a private method is only accessible in the same class
    * static method can be called with className directly
    * to call a non-static method we need object of the class
    */

}
