package com.bnta.robyn.week2;

public class exercise7 {

      /*   Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
        */


    //public static void main(String[] args) {

       /* String[] example = {"Maple", "Moose", "Loki", "Okey", "Duffle"};
        System.out.println(longest(example));

    }

    static String longest(String[] words){
        String long = "";
        int longestWord = 0;
        for(int i =0; i < words.length; i++){
            if(i.length() >= long){
                longestWord = i.length();
                long += i + ", ";
            }
        }
        return long;
    } */
 }