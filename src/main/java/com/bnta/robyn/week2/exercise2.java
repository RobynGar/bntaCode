package com.bnta.robyn.week2;

public class exercise2 {
        /*
          Given the following String input
          String input = "   b ri   ght net   work  "
          Write a program that transforms input into: Bright Network
        */
       public static void main(String[] args) {
        String input = "   b ri   ght net   work  ";
           System.out.println(transformSentence(input));


            }
            public static String transformSentence(String input) {
                input = input.trim().replaceAll("\\s+", "");

                input = input.replace('b', 'B');
                input = input.replace('n', 'N');
                input = input.substring(0, 6) + " " + input.substring(6, 13);
                return input;
            }
        }




