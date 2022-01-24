package com.bnta.robyn.week2;

public class exercise1 {

    public static void main(String[] args) {
        reverse("test a only is this");
    }

    static String reverse(String text) {
        String[] array = text.split(" ");
        String output = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    return "reverse";
    }
}


