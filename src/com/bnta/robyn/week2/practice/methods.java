package com.bnta.robyn.week2.practice;

public class methods {
    public static void main(String[] args) {
        sum(743, 689);
        System.out.println(negate(-7));
        System.out.println(same(5, 9));
        numbers(2,1);

    }
    //Exercise 1
    //Write a method which takes two numbers as arguments
    // and prints their sum to the terminal.
    public static void sum(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);

    }

    //Exercise 2
    //Write a method which takes a number as an argument
    // and returns that number negated, e.g. passing 5 as an
    // argument should return -5; passing -10 should return 10.
    // could use *-1 as - * - = + and - * + = -
    public static int negate(int number) {
        int negResult = number * -1;
        return negResult;
    }
    //exercise 3
       // Write a method which takes two numbers as arguments, checks if they are the same and returns the appropriate boolean value.
       // You should check both possible outcomes here, i.e. that it returns true when it is supposed to and false when it is supposed to.

        public static boolean same(int number1, int number2){
            boolean numSame = number1 == number2;
            return numSame;
        }

        //exercise 4
    //Write a method which takes two numbers as arguments and prints one of:
    //"The first number is larger"
    //"The second number is larger"
    //"The numbers are equal"

    public static void numbers(int n1, int n2){
        if(n1 > n2){
            System.out.println("The first number is larger");
        } else if( n1 < n2){
            System.out.println("The second number is larger");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}

