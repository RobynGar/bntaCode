package com.bnta.robyn.week2;


public class exercise3 {
   /*
      Write a program that receives numbers as program
      arguments and prints to console if numbers are
      even or odd You might compile and run the program
      via command line or by editing configuration and
      pass program arguments
    */
   public static void main(String[] args) {
     int numbers= 4;
       switch (numbers){
           case 1:
           case 3:
           case 5:
           case 7:
           case 9:
           case 11:
           case 13:
           case 15:
           case 17:
           case 19:
               System.out.println("Odd number");
               break;
           case 2:
           case 4:
           case 6:
           case 8:
           case 10:
           case 12:
           case 14:
           case 16:
           case 18:
           case 20:
               System.out.println("even number");
               break;
           default:
               System.out.println("number not included");
       }
   }
}
