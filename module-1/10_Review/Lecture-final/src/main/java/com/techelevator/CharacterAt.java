package com.techelevator;

public class CharacterAt {
    public static void main(String[] args) {
        String myString = "Hello World";
        for (int index = 0; index < myString.length(); index++) {
            char theCharacter = myString.charAt(index);
            System.out.println(theCharacter);
        }
    }
}
