package com.bnta.robyn.week2.email;

import java.util.Scanner;

public class exercise6 {
    /*
    Create a package called email
    Then have a method called validateEmail that return true of false if input is valid email
    Finally invoke validateEmail in main
    i.e. "hello@gmail.com" -> true
    i.e. "hellogmail.com" -> false
            */
    public static void main(String[] args) {
        validateEmail();


    }
    public static void validateEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your email?");
        String email = scanner.nextLine();
        System.out.println(email.contains("@"));
    }

}

