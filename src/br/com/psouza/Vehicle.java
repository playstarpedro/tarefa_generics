package br.com.psouza;

public abstract class Vehicle {

    private Long horsePower;

    private String color;

    private void turnOn() {
        System.out.println("The vehicle is turned on!");
    }

    private void turnOff() {
        System.out.println("The vehicle is turned off!");
    }
}
