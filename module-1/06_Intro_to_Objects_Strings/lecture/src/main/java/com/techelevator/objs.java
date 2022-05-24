package com.techelevator;

import java.util.Scanner;

public class objs {
    public static void main(String[] args) {
        String myString1 = "hello world";

        String myString2 = new String("hellow world");

        int[] arr = new int[3];
        int[] noArray = null;

        noArray = new int[]{1, 2, 3, 4, 5};
        noArray = new int[]{11, 12, 13, 14, 15};

        Scanner s = new Scanner(System.in);
        System.out.println(s);
        if (s == null) {
            System.out.println("s was never assigned");
        }
        double d = 42.0;

        System.out.println();

        String myString = "hello World";
        String myString3 = new String("hello world"); //rarely used

        System.out.println(myString.indexOf("wor"));


    }
}