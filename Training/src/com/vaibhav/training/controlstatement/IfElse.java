package com.vaibhav.training.controlstatement;

public class IfElse {
    public static void main(String[] args) {
        boolean hungry = false;   // default value of boolean variable is "false"
        if (hungry) {             // if block will only run when the condition is true
            System.out.println("I am starving...");
        } else {                  // when if block is false then else block will run
            System.out.println("I am not hungry.");
        }

        int hungerRating = 5;
        if (!(hungerRating > 5)){   // here we are giving a negative condition
            System.out.println("I am not hungry.");
        }
        else{
            System.out.println("I am hungry...");
        }

    }
}
