package com.bnta.robyn.week3.classes;
//Exercise 5
// Create a class to represent a car dealership.
// It should have properties representing its name,
// the maximum number of cars it can have on display and
// all the cars currently in stock.
// Exercise 6
//Write a method to count the number of cars in the dealership.
// It doesn't need to take any parameters and should return an int.
// Write another method to add a car to the dealership.
// The method should have a Car parameter and doesn't need to return anything.
// Test your method by counting the number of cars, adding a new car then counting again to make sure the number has gone up by one.
//Hint: You will need some way of finding the first empty slot in the array to save the Car in. Maybe checking each slot in the array in turn would help?

import java.util.Arrays;

public class carDealership {
    private String name;
    private int maxCars;
    private car[] carStock;


    //default constructor
    public carDealership() {

    }

    public carDealership(String name, car[] carStock) {
        this.name = name;
        this.maxCars = maxCars;
        this.carStock = new car[maxCars];
    }
// constructor- as a new dealership would have no cars
// initially in stock or on display we do not need to pass
// these values in () and set them to 0 which can later be
// edited on an individual basis for each dealership (object)
// the string array is also empty as there are no cars to add initially in new dealership


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCars() {
        return maxCars;
    }

    public void setMaxCars(int maxCars) {
        this.maxCars = maxCars;
    }

    public car[] getCarStock() {
        return carStock;
    }

    public void setCarStock(car[] carStock) {
        this.carStock = carStock;
    }

    @Override
    public String toString() {
        return "carDealership{" +
                "name='" + name + '\'' +
                ", maxCars=" + maxCars +
                ", carStock=" + Arrays.toString(carStock) +
                '}';
    }


}