package com.techelevator;

public class Tutorial {

    public static void main(String[] args) {

        // write your code here

        int answer = 0;
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                answer = answer + i;
            }
        }
        System.out.println(answer);