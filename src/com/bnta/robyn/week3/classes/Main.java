package com.bnta.robyn.week3.classes;

public class Main {
    public static void main(String[] args) {
        cat cat = new cat("Sir");
        String catName = cat.getName();
        System.out.println("cat's name=" + " " + catName);

        System.out.println("-----cars------");

        car cooper = new car("Mini",
                20_000,
                engineType.ELECTRIC);
        int carPrice = cooper.getPrice();
        String make = cooper.getManufacturer();
        engineType engine = cooper.getEngineType();
        System.out.println(carPrice);
        System.out.println(make);
        System.out.println(engine);

        car corsa = new car("vaxhull",
                5000,
                engineType.PETROL);
        System.out.println("-----next car -------");
        System.out.println(corsa.getPrice());
        System.out.println(corsa.getManufacturer());
        System.out.println(corsa.getEngineType());

        car mazda = new car();
        mazda.setPrice(30000);
        mazda.setManufacturer("mazda");
        mazda.setEngineType(engineType.PETROL);
        System.out.println("------next car-------");
        System.out.println(mazda);


    }

}

//Exercise 5
// Create a class to represent a car dealership.
// It should have properties representing its name,
// the maximum number of cars it can have on display and
// all the cars currently in stock.
// Hint 1: We could create an individual property for each car
// we have in stock, but is there a data type we have already
// seen which would let us store all our cars together in the
// same variable? How can we figure out how big that
// data structure should be?
//  Hint 2: A brand new dealership won't have any cars yet.
//  Do we need to pass that information in the constructor
//  when we create a dealership, or can we define our class
//  in such a way that every new dealership starts with no cars?
