package com.techelevator;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class QuizMaker {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the fully qualified name of the file that should be searched for?");
		String textFile = userInput.nextLine();
		File file = new File(textFile);

	}

}
