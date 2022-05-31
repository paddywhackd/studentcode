package com.techelevator;

import java.util.Scanner;

public class Dec2Bin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter some decimal values separated by space");
        String input = scanner.nextLine();
        String[] numbersAsArray  = input.split(" ");

        for(String numberAsString : numbersAsArray) {
            int num = Integer.parseInt(numberAsString);

            String result = "";
            while(num > 0) {
                int bit = num % 2;
                num = num / 2;
                result = bit + result;
            }

            System.out.println(result);

        }


    }
}
