package com.bnta.robyn.week4;

import java.util.*;

public class dataPractice {
    public static void main(String[] args) {

        Map<String, Integer> stuff = new HashMap<>();

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hi");
        list.add(1, "hey");

        System.out.println(Arrays.toString(list.toArray()));


    }
}
