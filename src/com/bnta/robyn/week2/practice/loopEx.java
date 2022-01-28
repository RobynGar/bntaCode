package com.bnta.robyn.week2.practice;

import java.util.Arrays;

public class loopEx {


    public static void main(String[] args) {

        // exercise 1
        // create a for loop which goes from 0 to 10
        // print each value

        for (int i = 0; i <= 10; i++)
            System.out.println(i);

        // exercise 2
        // create a for loop which goes from 10 down to 0
        // print each value

        for (int i = 10; i >= 0; i--)
            System.out.println(i);

        //exercise 3
        // create a for loop which goes from 0 to 20
        // print each even value

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
         }

            // exercise 4
            // create an array. Remember to manually set the size
            // create a for loop which goes from 0 to 10, adding each value to an array
            // print our array


            int[] practice = new int[11];
            for (int i = 0; i < practice.length; i++) {
                practice[i] = i;
            }
            String result = Arrays.toString(practice);
            System.out.println(result);
        // QUESTION 5
            // using your answer from Question 4, create a for loop that goes through the values
            // print each value individually

        for (int i = 0; i < practice.length; i++) {
            System.out.println(i);
        }
        // QUESTION 6
            // create a sum variable
            // using your answer from Question 4, create a for loop that goes through the values
            // add each item to the sum value
            // print the total sum
            int sum = 0;
        // an enhanced for loop, where "items" is a placeholder for the index positions
        // as we run through the loop and "practice" is the name we have given to our integer array
        for (int items: practice) {
             sum += items;
             // += means sum = sum + items
        }
        System.out.println(sum);

        // QUESTION 7
            // create a for loop which goes through each string in our array
            // make each word uppercase
            // assign the value in the array to the uppercase string
            // print our resulting array

            String[] bees = new String[]{"i", "sure", "do", "love", "bees"};
            for (int i = 0; i< bees.length; i++) {
                bees[i]= bees[i].toUpperCase();
            }
        System.out.println(Arrays.toString(bees));

        // QUESTION 8
            // create a for loop which goes through each string in our array
            // grab the first letter of our word
            // capitalise the first letter
            // add the capitalised letter to the rest of the provided word
            // assign the value to an array
            // print our resulting array
        String[] beesFL = new String[]{"i", "sure", "do", "love", "bees"};
        for(int i =0; i< beesFL.length; i++){
           char beesFirstLetter = beesFL[i].charAt(0);
           // char is the primitive for a character so above i am saying in the array at index position 0
           char beesCapLetter = Character.toUpperCase(beesFirstLetter);
           // character is a class thar wraps the primitive char in an object.
            // Above turns the char beesFirstLetter into object, so it can apply
            // the .toupperCase to the character at index 0 as specified in beesFirstLetter
           String beesResult = beesCapLetter + beesFL[i].substring(1);
           // creates a string containing the now capitalised index 0 position and the
            // rest of the beeFL array after and including index 1 as indicated by the substring
           beesFL[i]= beesResult;
           //this is making the array = to the string where we have made the first letter of the string capitalised
        }
        System.out.println(Arrays.toString(beesFL));

        // QUESTION 9
        int[]  numbers= new int[] {1, 6, 17, 9, 20, 5};
        // this assumes index position 0 is the largest number
        int greatestValue = numbers[0];
        // create a for loop which goes through number in our array
            for (int i = 0; i < numbers.length; i++) {
                // check whether the value at each index position in numbers array
                // is greater than the current greatest value which is assumed to be
                // the one at index 0
                if (numbers[i] > greatestValue) {
                    // if there is a number larger than the one at index 0
                    // then greatestValue now equals to that
                    greatestValue = numbers[i];
                }
             }
        // print the greatest value
        System.out.println(greatestValue);


        // reassign the current greatest value if true




    }


    }

