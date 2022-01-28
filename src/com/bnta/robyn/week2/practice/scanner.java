package com.bnta.robyn.week2.practice;

import java.util.Scanner;

public class scanner {

       public static void main(String[] args) {
            // args should contain numbers
          Scanner scanner = new Scanner(System.in);
          printQ1();
          int number1= scanner.nextInt();
          printQ2();
          int number2 = scanner.nextInt();
          int result = add(number1, number2);
           System.out.println(result);

    }
    static public int add(int num1, int num2){
           int result = num1 + num2;
           return result;
    }
    public static void printQ1() {
        System.out.println("Enter first number");
    }
    public static void printQ2() {
        System.out.println("Enter second number");
    }

}

