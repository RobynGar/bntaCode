package com.bnta.robyn.week2;

import java.util.Scanner;

public class exercise4 {
     /*
      Write a program that takes an input number from the
      console and prints if number is prime
      Create a method to check if number is prime
      then use against the input
    */
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a number");
        int number = scanner.nextInt();
         System.out.println(prime(number));

     }
     public static boolean prime(int number){
         if (number <=1){
             System.out.println(number + " is not a prime number");
             return false;

         }
         for (int i = 2; i < number; i++){
             if (number % i ==0){
                 System.out.println(number + " is not a prime number");
                 return false;

             }
         }
         System.out.println( number + " is a prime number");
         return true;
     }
}
