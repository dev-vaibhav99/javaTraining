package com.vaibhav.training.controlstatement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Enter the number of month: ");
        Scanner sc = new Scanner(System.in);        // We are using the Scanner class, so we have to import the class (java.util.Scanner)
        int month = sc.nextInt();
        switch (month) {                             // this is new style of switch statement
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }
    }
}
