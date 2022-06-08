package com.techelevator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Where do you want to save the file?");
		String destination = userInput.nextLine();

		try (PrintWriter destinationWriter = new PrintWriter(destination)) {
			for (int i = 1; i <= 300; i++) {
				if (i % 15 == 0) {
					destinationWriter.println("FizzBuzz");
				} else if (i % 3 == 0) {
					destinationWriter.println("Fizz");
				} else if (i % 5 == 0) {
					destinationWriter.println("Buzz");
				} else {
					destinationWriter.println(i);
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("Please try again.");
		}

	}
}