package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class OurRTNReader {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("rtn.txt");

        try (Scanner scanner = new Scanner(file);) {

            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();

                System.out.println(input);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("cant fine the file");

        }
    }
}
