package com.vaibhav.training.loops;

public class ForLoop {
    public static void main(String[] args) {
        //for loop to print sequence of numbers
        System.out.println("Forward loop");
        for(int i=0; i<=10; i++){
            System.out.println("Value of i is: "+i);
        }

        //for loop to print sequence of numbers backwards
        System.out.println("\n");
        System.out.println("Backward loop");
        for(int i=10; i>=0; i--){
            System.out.println("Value of i is: "+i);
        }

        System.out.println("\n");
        System.out.println("Forward loop");
        //for loop to print Even numbers till 10
        for (int j=0; j<=10; j+=2){
            System.out.println("Even numbers: "+j);
        }

        System.out.println("\n");
        System.out.println("Backward loop");
        //for loop to print Even numbers from 10 till 0
        for (int j=10; j>=0; j-=2){
            System.out.println("Even numbers: "+j);
        }

        System.out.println("\n");
        String str = "Hi, I am Vaibhav Chandrashekhar!";

        //for loop to print characters with index
        for (int k=0; k<str.length(); k++){
            System.out.println("char: "+str.charAt(k)+" at index: "+k);
        }

        System.out.println("\n");
        //for loop to print characters with index backwards
        for (int k=str.length()-1; k>=0; k--){
            System.out.println("char: "+str.charAt(k)+" at index: "+k);
        }
    }
}
