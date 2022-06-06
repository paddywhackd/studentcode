package com.techelevator;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WordSearch {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the fully qualified name of the file that should be searched for.");
        String textFile = userInput.nextLine();
        System.out.println("What is the search word you are looking for?");
        String wordSearch = userInput.nextLine();
        System.out.println("What is the search word you are looking for?");
        String caseSensitive = userInput.nextLine();

        try {

            Scanner scanner = null;
            File file = new File(textFile);
            scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                count++;
                if (nextLine.contains(wordSearch.toLowerCase())) {

                }
            }


        }
    }
}
