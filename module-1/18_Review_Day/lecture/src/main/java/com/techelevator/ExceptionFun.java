package com.techelevator;

public class ExceptionFun {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;


        }
        catch (ArithmeticException ae) {
        throw new IllegalArgumentException("please dont give me a zero");
        }
        catch (Exception e) {
            return;
        } finally {

        }
    }
}