package com.bnta.robyn.week2;

public class exercisesEnums {
    public static void main(String[] args) {
        System.out.println("T-shirt size is a " + tshirtSize.MEDIUM);

       // exercise 3
        // invoke .values() method on tshirtSize enum and loop through its values and while looping lowercase each value
        // hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase
        /*
        tshirtSize size = tshirtSize.values();

        for (tshirtSize item : size) {
            System.out.println(size.name().toLowerCase());
        }
        */
    }
}
