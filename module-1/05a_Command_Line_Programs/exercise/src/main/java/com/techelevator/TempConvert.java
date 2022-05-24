package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your temp, warm boy: ");
		int temp = input.nextInt();
		input.nextLine();

		System.out.println("Is this in her majesties celsius or freedom units? ");
		String celsiusOrFahrenheit = input.nextLine();

		if (celsiusOrFahrenheit.equals("C")) {

			int convertToF = (int)((temp * 1.8) + 32);

			System.out.println(temp + "C is " + convertToF + "F.");

		} else if (celsiusOrFahrenheit.equals("F")) {

			int convertToC = (int)((temp -32) / 1.8);

			System.out.println(temp + "F is " + convertToC + "C.");
		}
	}

}
