package com.qascript;

public class AddNumbers {

    public static void main(String[] args) {
        addNumbers(100,250);
        addNumbers(-3,10);
        addNumbers(25,62);

        int result = addNumbers(6,5);
        int output = result + 5;
        System.out.println("Increment the output: "+ output);
    }
    public static int addNumbers(int num1, int num2){

        int res = num1 + num2;
        System.out.println("Addition of 2 numbers: "+ res);

        return res;

    }

}
