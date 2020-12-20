package com.vaibhav.training.basic;

public class Arrays {
    public static void main(String[] args) {
        // indexing starts from 0 and goes till length-1
        // only similar data type values can be stored in the array
        // default value in array is 0

        int[] arr = new int[5]; //integer array of size 5
        arr[0] = 10; // initialising 0th index with some value
        arr[2] = 100;
        System.out.println(arr[0]);
        System.out.println(arr[2]);

        double[] doubleArray = new double[5]; // double array of size 5
        doubleArray[0] = 22222.4343;
        doubleArray[1] = 96868.544545;

        String[] words = new String[] {"My", "name", "is", "Vaibhav"}; //String array with the values
        System.out.println(words[3]);
    }
}
