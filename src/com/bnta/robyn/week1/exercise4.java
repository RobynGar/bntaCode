package com.bnta.robyn.week1;

public class exercise4 {
    public static void main(String[] args) {

    String input = "0.90, 1.00, 9.00, 8.78, 0.01";
    String[] inputArray = input.split(", ");

    double result = 0;

    for (int i = 0; i < inputArray.length - 1; i++) {
        String number = inputArray[i];
        double numberDbl = Double.parseDouble(number);
        result = result + numberDbl;
    }

    System.out.println(result);
}
}

