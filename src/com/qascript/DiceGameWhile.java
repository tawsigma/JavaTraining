package com.qascript;

import java.util.Scanner;

public class DiceGameWhile {

    public static void main(String[] args) {

        System.out.println("Enter our number");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        while(number > 10 ) {

            if (number < 15) {
                System.out.println("You have won the game");
            }
            else {
                System.out.println("You have lost this game");
            }
        }

        //System.out.println(number);
    }

}
