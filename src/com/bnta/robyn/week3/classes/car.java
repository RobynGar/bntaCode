package com.bnta.robyn.week3.classes;

public class car {


    //Exercise 1
    //Create a class to represent a car.
    // The car should have properties representing the
    // manufacturer, price, and engine type (eg. petrol, electric, etc).
    private String manufacturer;
    private int price;
    private engineType engineType;



// these are constructor top is default constructor
    public car(){

    }

    public car(String manufacturer, int price, engineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }
    //Exercise 2
    //Write getters for each of these properties. Test them in Main.

    // getter
    public String getManufacturer() {
        return manufacturer;
    }
    //Exercise 3
    //Write setters for the properties. Test them in Main.

    //setter
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    //getter
    public int getPrice() {
        return price;
    }
    //setter
    public void setPrice(int price) {
        this.price = price;
    }
    //getter
    public engineType getEngineType() {
        return engineType;
    }
    //setter
    public void setEngineType(engineType engineType) {
        this.engineType = engineType;
    }
    //tostring to override the function specified in the parent object superclass
    @Override
    public String toString() {
        return "car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
//Exercise 4 (optional - slightly harder)
//Modify the engine type property to use an EngineType enum.
// You'll need to modify the getter and setter
// to reflect the different data type.

