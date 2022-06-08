package com.techelevator;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WordSearch {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the fully qualified name of the file that should be searched for?");
        String textFile = userInput.nextLine();
        File file = new File(textFile);
        System.out.println("What is the search word you are looking for?");
        String wordSearch = userInput.nextLine();
        System.out.println("Should the search be case sensitive? (Y\\N)");
        String caseSensitive = userInput.nextLine();

        try {

            Scanner scanner = null;

            scanner = new Scanner(file);
            int count = 1;
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (caseSensitive.equalsIgnoreCase("n")) {
                    if (nextLine.toLowerCase().contains(wordSearch.toLowerCase())) {
                        System.out.println(count + " " + nextLine);
                    }
                } else {


                    if (nextLine.contains(wordSearch)) {
                        System.out.println(count + " " + nextLine);
                    }
                } count++;
            }


        } catch (FileNotFoundException fne) {
            System.out.println();
        }

    }

}