package com.bnta.robyn.week2;

public class exercise1 {

    public static void main(String[] args) {

        System.out.println(reverse("tset"));
        System.out.println(reverse("elpam"));
        System.out.println(reverse("esoom"));

    }

    public static String reverse(String text) {
        String output = "";
        // above works as a placeholder for the reversed string
        for (int i = text.length() - 1; i >= 0; i--) {
            output += text.charAt(i);
            //above adds the character to the last reversed character
        }
    return output;
    }
}


