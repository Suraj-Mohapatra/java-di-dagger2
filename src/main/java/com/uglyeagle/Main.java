package com.uglyeagle;

//import com.uglyeagle.DaggerCarComponent;

public class Main {
    public static void main(String[] args) {
        CarComponent component = DaggerCarComponent.create();
        Car car = component.buildCar();
        car.drive();
    }
}