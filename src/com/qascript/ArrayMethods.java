package com.qascript;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int [][] numberGrid = {{1,2},{3,4}};
        numberGrid [0][1] =99;

        System.out.println(numberGrid[0][1]);
        System.out.println(numberGrid[0][0]);


        int arr[] = {9,4,1,8,10};
        int arr2[] = {4,5,6,7,1};
        System.out.println("Original order:" + Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("Length of the array is: " + arr.length);
        System.out.println("Sorted array: " +Arrays.toString(arr));

        Arrays.compare(arr,arr2);

        if(arr.equals(arr2)){

            System.out.println("The Arrays are equal");
        }
        else {
            System.out.println("The Arrays are not equal");
        }


    }

}
