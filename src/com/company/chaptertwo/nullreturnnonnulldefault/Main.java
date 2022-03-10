package com.company.chaptertwo.nullreturnnonnulldefault;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", null);

        System.out.println("Car name: " + car.getName());
        System.out.println("Car color: " + car.getColor());
    }
}
