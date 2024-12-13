package com.qascript;

public class Car {

        private String color;
        private int size;
        private double weight;

        Car () {


        }

    public static void start(){

            System.out.println("Press the start key");
    }

    public static void accelerate(){
            System.out.println("Press the accelerator");
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void displayCar(){
        System.out.println("Color of the car is: " + color);
        System.out.println("Weight of the car is: " + weight);
        System.out.println("Size of the car is: " + size);
    }
}




