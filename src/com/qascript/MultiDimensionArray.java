package com.qascript;

import java.util.Arrays;

public class MultiDimensionArray {

    public static void main(String[] args) {

        String [] cars = {"Toyota","Honda","Chevrolet","Chrysler"};
        //[0][1][2][3]


        for (int i = 0; i < 4;  i++){

            System.out.println("Standard for loop method = " + cars[i]);

        }

        for (String car: cars){
            System.out.println("Foreach loop method = " + car);
        }

        //2D array = an array of arrays

        String [][] multicar = {
                                    {"Camaro ","Corvette ","Silverado "},
                                    {"Mustang ","Ranger ","F-150"},
                                    {"Ferrari ","Lamborghini"," Tesla"}
                                };

        /*multicar[0][0] = "Camaro";
        multicar [0][1] = "Corvette";
        multicar [0][2] = "Silverado";
        multicar [1][0] = "Mustang";
        multicar [1][1] = "Ranger";
        multicar [1][2] = "F-150";
        multicar [2][0] = "Ferrari";
        multicar [2][1] = "Lamborghini";
        multicar [2][2] = "Tesla";*/

        for (int i = 0; i <multicar.length; i++ ) {
            System.out.println();
            for (int j = 0; j<multicar[i].length; j++) {
                System.out.print(multicar[i][j]);
            }
        }



    }
}
