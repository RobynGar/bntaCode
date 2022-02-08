package com.bnta.robyn.week4.ds;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        // shift + control + space bar to show you the different implementations
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Robyn"));
        // command d on the line you want to copy will be copied below
        map.put(2, new Person("Zoe"));
        // key in this case the integer must be unique otherwise it will override the value, in this case person, with the new value
        map.put(3, new Person("April"));
        map.put(4, new Person("Deborah"));
        // print out the map with what the key and value is set to (2=Person[name=Zoe]) for everything in your map
        System.out.println(map);
        // gives you the size of the map (4)
        System.out.println(map.size());
        // gives you the value set at the key 2
        System.out.println(map.get(2));
        //returns true/false if there is a key 5 in your map
        System.out.println(map.containsKey(5));
        // prints the keys in your map
        System.out.println(map.keySet());
        //prints out the entry sets (key and the corresponding values in you map)
        System.out.println(map.entrySet());
        // prints out each entry set on a new line
        map.entrySet().forEach(System.out::println);
    }

    record Person(String name){}
}
