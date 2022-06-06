package com.techelevator;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String input = scanner.nextLine();

        try {
            int guess = Integer.parseInt(input);
            System.out.println(guess);
        } catch (NumberFormatException nfe) {
            System.out.println("cannot convert to a number");
        } finally {
            System.out.println("this will always happen");
            scanner.close();
        }
    }

    private static int convertTheGuess(String theGuess) {
        return Integer.parseInt(theGuess);
    }

    private static int anotherLevelForFun(String guess) {
        throw new IllegalArgumentException("bad robot");

        //       int theNumber = Integer.parseInt(guess);
        //     System.out.println("wont happen for an exception");
        //     return theNumber;
    }

}

