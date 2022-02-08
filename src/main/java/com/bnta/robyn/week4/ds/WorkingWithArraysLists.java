package com.bnta.robyn.week4.ds;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkingWithArraysLists {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        // removes the item at index position 2 (at index position 2 is number 3)
        list.remove(2);
        System.out.println(list.contains(3));
        //clears all items from list
        list.clear();
        // checks the list is empty
        System.out.println(list.isEmpty());
        // add back in
        list.add(1);
        list.add(2);
        list.add(3);
        //enhanced for loop method. e = element
        list.forEach(e -> {
            System.out.println("e =" + e);
        });
        // OR
        for (Object e : list) {
            System.out.println("e =" + e);
        }
        // OR (if you need access to the index)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // want to know the index position of item 2 is at index position 1
        System.out.println(list.indexOf(2));
    }
}
