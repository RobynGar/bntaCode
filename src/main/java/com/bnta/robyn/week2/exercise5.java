package com.bnta.robyn.week2;

import java.util.Random;
import java.util.Scanner;

public class exercise5 {
    /*
        Write a method that displays random joke to the user.
        Your program should stop displaying jokes when use inputs no.
        For e.g
        Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit
    */
    public static void main(String[] args) {
        //Read in the input
        String x;


        //loop through if yes, exit if no and anything else display try again
        boolean nextJoke = true;

        while (nextJoke) {
            x = userInput();
            if (x.equals("yes") || x.equals("Yes") || x.equals("y") || x.equals("YES")) {
                displayRandomJoke();
            } else if (x.equals("no") || x.equals("No") || x.equals("n") || x.equals("NO")) {
                System.out.println("no joke for you then");
                nextJoke = false;
            } else {
                System.out.println("try again, yes or no");
            }


        }


    }
    static String userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to hear a joke? Yes or No");
        String input = scanner.nextLine();  // Read user input
        return input;
    }

    static void displayRandomJoke() {
        String[] randomJokesArray = new String[5]; //0-4 index and 5 jokes in this array
            randomJokesArray[0]= "I could not figure out why the ball kept getting closer and closer, and then it hit me.";
            randomJokesArray[1]= "I can’t believe I got fired from the calendar factory. All I did was take a day off!";
            randomJokesArray[2]= "Most people are shocked when they find out how bad I am as an electrician.";
            randomJokesArray[3]= "I’m reading a book about anti-gravity. It’s impossible to put down.";
            randomJokesArray[4]= "I heard there were a bunch of break-ins over at the car park. That is wrong on so many levels.";


        //random num generator
        Random randNum = new Random();
        int i = randNum.nextInt(randomJokesArray.length);
        //generator.generateRandomNumber(upperbound) => gives a number between 0 and upperbound-1 e.g. the number in this array is 5 but the last index position is 4, so length-1.

        //for the .nextInt you do not need to specify length-1 as it knows so just put length
        System.out.println(randomJokesArray[i]);

    }
}




