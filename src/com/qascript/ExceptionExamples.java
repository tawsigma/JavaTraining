package com.qascript;

public class ExceptionExamples {

    public static void main(String[] args) {
        handleArithmeticException(100);
        handleNullPointerException(null);
    }

    private static void handleArithmeticException(int number) {

        try {
            int a = number / 0;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }
    }

    private static void handleNullPointerException(String s){

        try {

            System.out.println(s.length());

        }
        catch (NullPointerException exception) {

            exception.printStackTrace();
        }

    }
}