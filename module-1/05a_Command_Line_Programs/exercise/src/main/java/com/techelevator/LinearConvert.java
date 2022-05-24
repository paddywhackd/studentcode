package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Length big boy: ");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("Is this in her majesties meters or freedom units? ");
        String metersOrFreedomUnits = input.nextLine();

        if (metersOrFreedomUnits.equals("m")) {
            int convertToFeet = (int)(length * 3.2808399);
            System.out.println(length + "m is " + convertToFeet + "f.");
        } else if (metersOrFreedomUnits.equals("f")) {
            int convertToMeters = (int)(length * 0.3048);
            System.out.println(length + "f is " + convertToMeters + "m.");
        }

    }

}