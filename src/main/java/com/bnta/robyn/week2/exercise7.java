package com.bnta.robyn.week2;

public class exercise7 {

      /*  Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
        */


    public static void main(String[] args) {

        String[] example = {"Maple", "Moose", "Loki", "Okey", "Duffle"};
        System.out.println(longest(example));

    }

    public static String longest(String[] words) {
//
        if (words == null) return "";
        // if the string given contains null/empty spaces return an empty string as no work is the longest as they are all empty
        String longest = "";
        // this is a placeholder string that will store the longest words
        int longestWord = 0;
        // each string in the arrays word length will be compared to the word length of 0
        for (String i : words) {
            // this is an enhanced for loop that loops through the array words (which is the name we have given to the string array as an argument in the parameters) at each index position which we have given the placeholder name i
            if (i.length() > longestWord) {
                // if the length of the index position is greater than 0 which is what the longest word is equal to
                longestWord = i.length();
                // then the longestWord now equals to that index position
                longest = i + ", ";
                // this adds the longest word to the placeholder string we created above, in addition to a comer and a space
            } else if (i.length() == longestWord) {
                // otherwise, if the index position we have not looped to is equal to the length of the string currently stored in the longestWord
                boolean duplicate = false;
                // boolean set to see if the string with the same numbers is the same string context
                for (String dex : longest.split(",")) {
                    // loop through again
                    if (dex.equals(i)) {
                        // compare if the new index (we named dex is equal to the content of the index position i, which is currently stored in longest string)
                        duplicate = true;
                        // if the content is the same then the boolean duplicate is true
                        break;
                        //and we break and do not add it to longest string
                    }
                }
                if (!duplicate) {
                    // if it is not = to duplicate (! = not)
                    longest += i + ", ";
                    // then it is the same word length as the word currently stored in longest string but not the same word so we add it to longest string
                }
            }
        }
        return longest.substring(0, longest.length() - 2);
        // return the longest string that holds the strings with the longest words

    }
}