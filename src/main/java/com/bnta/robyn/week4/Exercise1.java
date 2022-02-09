package com.bnta.robyn.week4;

import java.util.*;


public class Exercise1 {
    //ex1
    //Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
    //Find the number of occurences for each element


        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";

    public HashMap<String, Integer> check(String input){
        //create the map to store the value
        HashMap<String, Integer> map = new HashMap<>();
        // .split because we want individual numbers as
        // it is currently a string of numbers and store
        // it in string array called split, which is split
        // by ,
        //split string by comma
        String[] split = input.split(",");
        //enhanced for loop
        for (String e: split) {
            //if condition, if does not contain e/element
            // then. checking if the map has the key
            // if the element, value at that index does not
            // already exist in our map then we give it the value 1
            if (!map.containsKey(e)) {
                //put e/ element in the map
                map.put(e, 1);//key = e value = 1
            } else {
                // if the key already exists in out map then
                // we add 1 to the value of that key
                int count = map.get(e) + 1;
                //if it does have that element then add
                // one to that key within the map, gets our
                // element and adds 1 to it
                map.put(e, count); // puts key and count in the map
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


