package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the word?");
        String searchWord = userInput.nextLine();

        System.out.println("What are you replacing?");
        String replaceWord = userInput.nextLine();

        System.out.println("What is the source File?");
        String sourceFile = userInput.nextLine();
        File inputSourceFile = new File(sourceFile);
        System.out.println("What is the destination?");
        String destinationFile = userInput.nextLine();
        File inputDestinationFile = new File(destinationFile);

        try(Scanner newSourceFile = new Scanner(inputSourceFile); PrintWriter destinationWriter = new PrintWriter(destinationFile)) {
            while (newSourceFile.hasNextLine()) {
                String line = newSourceFile.nextLine();
        destinationWriter.println(line.replaceAll(searchWord, replaceWord));


            }
        }catch (FileNotFoundException e) {
            System.out.println("Please try again.");
        }
    }
}
