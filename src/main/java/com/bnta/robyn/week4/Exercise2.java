package com.bnta.robyn.week4;

import java.util.*;

public class Exercise2 {
    //ex2
    //Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
    //Find the element that has the most number of occurences
    //Your method should return something like the 1 since it occurs 4 times
    //Think about the data structure that you should use
    //Create a method. Think about the return type and parameters
    //Write unit tests for your method


    String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";


    public List<String> mode(String input) {

        if (input == null || input.isEmpty()) {
            return List.of();
            // return empty list
        }
        //loop through map
        // have max = 0
        // list string that we add values to when >= max
        // if so replace max value and add to string
        // return string values

        //call map this is what I want to add the input to and loop through
        HashMap<String, Integer> map = new HashMap<>();

        // this is the count I want to compare each number
        // of occurrences to, 1st to see if greater or equal
        // to current if it is replace max to this number
        // and add it to the list values, which is where the
        // mode for the input will be stored
        int max = 0;
        List<String> values = new ArrayList<>();

        // method to add input to map and assign the input
        // as key and give it a value of 1 so that when we
        // encounter the same key again we add 1 to the
        // value of that key


        // call on class where other method is stored
        Exercise1 exercise1 = new Exercise1();
        //call on method in that class
        // make a new map = to the entry(key + value pair) in this method
        HashMap<String, Integer> mostCommon = exercise1.check(input);

        // loop though the map entries (key and value pair). map we called mostCommon. e is the element / entry we are looping through
        for (Map.Entry<String, Integer> e : mostCommon.entrySet()) {
            // if index (value) in map is >= int max then max will = this value
            if (e.getValue() > max) {
                // the int value of the entry is greater than 0 so make that the new max
                max = e.getValue();
                //if value of e is greater than max, empty list to get rid of values that have a lower occurrence
                values.clear();
                // values = list name, add the corresponding key of the map entry to the list
                values.add(e.getKey());
            } else if (e.getValue() == max){
                values.add(e.getKey());
            }
        }

        return values;
        // return the list we called values were the mode/ modes are stored

    }
}
