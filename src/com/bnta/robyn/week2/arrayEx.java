package com.bnta.robyn.week2;

import java.util.Arrays;

public class arrayEx {
    public static void main(String[] args) {
        // exercise 1
        // declare an empty integer array of length = 3
        int[] empty = new int[3];

        // using your array from Q1, print the contents to the console
        System.out.println(Arrays.toString(empty));

        // using your array from Q1, fill it with the number `4`
        // print the array to the console
        for (int i = 0; i < empty.length; i++) {
            empty[i] = 4;
        }
        //reprinting as program is reads line by line to print out new
        // array with all 4's need to print after the program
        // that changes it
        System.out.println(Arrays.toString(empty));

        // adding onto your code from questions 1-3,
        // reassign the second value in the array to the
        // number `17`
        // print the array to the console
        empty[1]=17;
        System.out.println(Arrays.toString(empty));

        // Q5 declare and initialise a String array which
        // holds the values "a", "b", "c" and "d"
        // print the array to the console
        String[] stringArray = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(stringArray));

        // using your answer to Q5, create a second array which
        // is initialised using your original array
        // hint: instead of using the `new` keyword,
        // try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare

        String[] stringArray2 = stringArray;
        stringArray[0]= "z";
        System.out.println(Arrays.toString(stringArray2));
        System.out.println(Arrays.toString(stringArray));
        // as we have made the arrays = to each other it is
        // refering to the same position in the memory like
        // using the same shopping basket if someone adds
        // something to the shopping basket the other person
        // also now has in (memory location is basket)

        // using your answer to Q5, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare

        String[] copy = Arrays.copyOf(stringArray, 4);
        // new array string in memory as copy not refering to the same memory location
        copy[0]= "z";
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(stringArray));

        // using your array from Q5, create a `for` loop which prints each item in the array
        for (String loArray : stringArray) {
            System.out.println(loArray);
        }
        // declare a new array which can hold the numbers
        // from 1-10 (inclusive)
        // create a `for` loop which initialises this
        // array with the numbers 1-10
        // print the array to the console
       int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
           System.out.println(numArray[i]);
        }
        // Q9 - adding onto your example from Q8,
        // now create a second `for` loop which reassigns
        // each value in the array to be double the initial
        // value again print the array

        for (int i : numArray){
            numArray[i-1]= numArray[i-1] * 2;
        }
        System.out.println(Arrays.toString(numArray));
        //or can do it below way. Above do not need to add 1
        // as i say index position is 1 in the numArray whereas
        // below the loop sets index position 0 to 0 and so
        // all index position have to have a 1 added on them
        // to be an array between 1-10
       /* int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i]= i + 1;
        }
        for (int i = 0; i < 10; i++) {
            num[i]= num[i] * 2;
        }
        System.out.println(Arrays.toString(num));

        */
        //the issue before of why it was printing 10 times
        // is because sout was in the for loop{}

        // start from your solution to Q5
        // create a String variable called `condition` which has the value "c"
        // create a Boolean variable called `hasC` which has the value `false`
        // create a `for` loop which goes through each item in our array, comparing it against our `condition` variable
        // if the two are equal, change the `hasC` value to `true`
        // once the `for` loop concludes, print out a message which tells you if `hasC` is `true` or `false`

        String condition = "c";
        boolean hasC = false;
        for (String item : stringArray){
            // compare condition to string Array variable
           if(item == condition){
               hasC = true;
               break;
           }
        }
        System.out.println(hasC);
        //hasC variable at the beginning is set to false as true is only returned
        // if c in the condition string then assign a
        // new value to the boolean. Compare each
        // element of the stringArray to C in condition string
        // and return true if they match
    }
}
