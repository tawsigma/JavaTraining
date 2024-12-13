package com.qascript;

public class Audi {

public static void main(String[] args) {

    Car audi = new Car();
    audi.setColor("red");
    audi.setSize(60);
    audi.setWeight(21.34);
    audi.displayCar();
    Car.start();
    Car.accelerate();

    displayLogo("Audi" + "()()()()");
    displayLogo("Audi()()()() ", " Q3");
    }

    public static void displayLogo(String s1){

        System.out.println("Audi Logo is " + s1);

    }

    public static void displayLogo(String s1, String s2){

        System.out.println("Audi Logo is " + s1 + "and type of audi" + s2);

    }

}



