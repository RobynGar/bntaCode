package com.bnta.robyn.week2;

import java.util.Scanner;

public class switchmonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter month, 1-12");
        int month = scanner.nextInt();
        System.out.println(monthswitch(month));
    }
    public static String monthswitch(int month){
        switch(month){
            case 1:
               return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            default:
                return "not valid month";
        }
    }
}
