package com.codegym;

public class Car {
    private String name;
    private String color;
    public static int numberOfCars;
    public Car(String n,String c){
        this.name=n;
        this.color=c;
        numberOfCars++;
    }

}
