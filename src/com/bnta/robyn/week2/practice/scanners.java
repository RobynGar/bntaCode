package com.bnta.robyn.week2.practice;

import java.util.Scanner;

public class scanners {


    public static void main(String[] args) {

        // QUESTION 1
        // create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
        // create a variable which is assigned to the value passed into the scanner from the terminal
        // print this variable

        Scanner pScanner = new Scanner(System.in);
        String value = pScanner.nextLine();
        System.out.println(value);

    }

}
