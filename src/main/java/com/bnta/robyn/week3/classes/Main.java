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


        carDealership garageOnTheGreen = new carDealership();
        garageOnTheGreen.setName("Garage on the Green");
        garageOnTheGreen.setMaxCars(10);
       garageOnTheGreen.setCarStock(new car[garageOnTheGreen.getMaxCars()]);

        System.out.println("----car dealership------");
        System.out.println(garageOnTheGreen);
        System.out.println(garageOnTheGreen.getCarStock());



    }

}

