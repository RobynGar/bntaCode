package com.bnta.robyn.week4;

import java.util.*;


public class Exercise1 {
    //ex1
    //Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
    //Find the number of occurences for each element

    //ex2
    //Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
    //Find the element that has the most number of occurences
    //Your method should return something like the 1 since it occurs 4 times
    //Think about the data structure that you should use
    //Create a method. Think about the return type and parameters
    //Write unit tests for your method

        //List<Integer> list = Arrays.asList(1,1,1,1,3,4,5,6,7,7,7,8,8);
        // this is what we want to pass into our method
        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";





//    public Map<Integer, Integer> mode(List<Integer> list) {
//        //created hashmap called map
//        Map <Integer, Integer> map = new HashMap<>();
//        // looped through list given as input
//        for (Integer i : list) {
//            //each element in the list becomes the key in the map we are creating
//            Integer value = map.get(i);
//        }
//
//        return map;
//    }

    public HashMap<String, Integer> check(String input){
        //create the map to store the value
        HashMap<String, Integer> map = new HashMap<>();
        // .split because we want individual numbers as it is currently a string of numbers
        String[] split = input.split(",");
        //enhanced for loop
        for (String e: split) {
            //if condition, if does not contain e/element then. checking if the map has the key
            if (!map.containsKey(e)) {
                //put e/ element in the map
                map.put(e, 1);//key = e value = 1
            } else {
                int count = map.get(e) + 1;
                //if it does have that element then add one to that key within the map
                map.put(e, count); //gets our element and adds 1 to it
            }
        }
        return map;
    }
}



//    public Map<Integer, Integer> mode(List<Integer> list){
//
//        List<Integer> list = Arrays.asList(1,1,1,1,3,4,5,6,7,7,7,8,8);
//    }

// public String mode(List<String> string){
//     int count1 = 0;
//     int count3 = 0;
//     int count4 = 0;
//     int count5 = 0;
//     int count6 = 0;
//     int count7 = 0;
//     int count8 = 0;
//
//
//     List<String> list = new ArrayList<>();
//     list.add("1");
//     list.add("1");
//     list.add("1");
//     list.add("1");
//     list.add("3");
//     list.add("4");
//     list.add("5");
//     list.add("6");
//     list.add("7");
//     list.add("7");
//     list.add("7");
//     list.add("8");
//     list.add("8");
//
//     for (int i = 0; i < list.size(); i++) {
//         if(list.get(i).equals("1")) {
//             count1++;
//         } else if (list.get(i).equals("3")){
//             count3++;
//         } else if (list.get(i).equals("4")){
//             count4++;
//         } else if (list.get(i).equals("5")){
//             count5++;
//         } else if (list.get(i).equals("6")){
//             count6++;
//         } else if (list.get(i).equals("7")){
//             count7++;
//         } else if (list.get(i).equals("8")){
//             count8++;
//         } else {
//             System.out.println("number not in list");
//         }
//     }
//
//
//     return count1;
// }


