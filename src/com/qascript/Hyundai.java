package com.qascript;

public class Hyundai extends Car {

    public static void main(String[] args) {

        start ();
        accelerate();
        brakes();

    }

    public static void brakes(){

        System.out.println("Press the brakes to stop the car");
    }

    public static void start(){

        String key = "ON";
        System.out.println("Turn the key " + key + " to start the car");
    }

}
