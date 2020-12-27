package com.vaibhav.training.basic;

public class Variables {
    public static void main(String[] args) {
        /* A legal variable name should follow some rules:
        * a variable name can contain letters, numbers and underscore
        * it should not start with a number
        * special symbols are not allowed
        * only underscore is allowed in a variable name
        * the variable name should always be relative and meaningful */

        byte verySmallNumber = 1; // byte date type have very small range (1 byte)

        short smallNumber = 3343; // short data type have slightly big range than byte (2 bytes)

        int num; // declaring a variable with the data type.. int data type supports only whole numbers (4 bytes)
        num = 10000;// initiating the variable with some value
        num+=num;  // using the variable in an expression
        System.out.println(num); //using the variable as we need them
        long bigNumber =99334343; // long data type supports whole values of large range (8 bytes)

        float decimal = 3.14f; // float data type supports decimal values (4 bytes)

        double bigDecimal = 99.84543; // double data type have large range of decimal values (8 bytes)

        char letter = 'a'; // char stores only single letters or number.. should be written in single quotes
        String word = "Hi, I hope you have understood variables and data types clearly";
        // this is a string data and in java String is a class..
        // String should be written in double quotes

        boolean decision = false; // this is boolean data type
        System.out.println(word);
    }
}
