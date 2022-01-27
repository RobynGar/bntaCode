package com.bnta.robyn.week2;

public class loopEx {


    public static void main(String[] args) {

        // exercise 1
        // create a for loop which goes from 0 to 10
        // print each value
        /*
    for (int i = 0; i<=10; i++)
        System.out.println(i);
        */
        // exercise 2
        // create a for loop which goes from 10 down to 0
        // print each value
        /*
        for (int i =10; i>=0; i--)
        System.out.println(i);
        */
        //exercise 3
        // create a for loop which goes from 0 to 20
        // print each even value
    /*
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
         */
        // exercise 4
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array


        int[] practice = new int[11];
            for (int i = 0; i < practice.length; i++) {
             practice[i] = i;
                System.out.println(i);
            }




    }


}
