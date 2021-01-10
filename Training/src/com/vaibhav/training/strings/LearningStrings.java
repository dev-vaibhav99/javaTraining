package com.vaibhav.training.strings;

public class LearningStrings {
    /* String is a sequence of characters
    *  Strings should always be enclosed in "Double Quotes"
    *  Each character in string have an index
    *  Index starts from 0 till length-1
    *  charAt(index) functions returns character at given index
    *  str.length() returns the length of string
    *  substring(start,end-1) takes starting_point(compulsory,from given index) and ending_point(optional,given index-1) as arguments
    *  str.equals(string) checks if given strings are equal or not (case sensitive)
    *  str.equalsIgnoreCase(string) is not case sensitive and checks if both strings are equal
    *  indexOf(string) returns index of given string (from starting)
    *  lastIndexOf(string) returns index of given string (from last) */

    public static void main(String[] args) {
        String str = "This is a string...";
        String hello = "Hello";

        int lengthOfString = str.length();
        System.out.println("Length of the string is: "+lengthOfString);

        char charAtIndex = str.charAt(6);
        System.out.println("Character at index 6 is:"+charAtIndex);

        String subString = str.substring(9,16);
        System.out.println("Substring from index 9 to 16 is:"+subString);

        String subStringTillEnd = str.substring(9);
        System.out.println("Substring from index 9 till end:"+subStringTillEnd);

        int indexFromStarting = str.indexOf("is");
        System.out.println("The first occurrence of string word on index: "+indexFromStarting);

        int indexFromLast = str.lastIndexOf("is");
        System.out.println("The last occurrence of string word on index: "+indexFromLast);
        //To check if two strings are equal we use str.equals(string) method [not == for strings]
        //equals() is case-sensitive
        if(hello.equals("hello")){
            System.out.println("Matching case Hello");
        }
        else{
            System.out.println("Non matching hello");
        }

        if(hello.equalsIgnoreCase("hello")){
            System.out.println("Case is ignored");
        }
        else{
            System.out.println("This is different spelling");
        }
    }
}
