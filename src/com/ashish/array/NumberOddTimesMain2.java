package com.ashish.array;

import java.util.HashMap;
import java.util.Map;

/*
Java program to find the element occurring odd number of times
 */
public class NumberOddTimesMain2 {

    public static void main(String[] args){
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20, 50, 20};
        int number = getOddTimesElement(array);
        if(number != -1){
            System.out.println("Number which has occurred off num of times: " + number);
        }else{
            System.out.println("All the elements of the array are even in number!");
        }
    }

    private static int getOddTimesElement(int[] array) {
        HashMap<Integer, Integer> mapElement = new HashMap<Integer, Integer>();
        int element=0;

        for(int i = 0; i < array.length; i++){
            element = array[i];
            if(mapElement.get(element) == null){
                mapElement.put(element, 1);
            }else{
                mapElement.put(element, (mapElement.get(element) + 1) );
            }
        }

        // Traverse through the hashmap to get the key with odd value as occurrence
        for(Map.Entry<Integer, Integer> entry: mapElement.entrySet()){
            if((entry.getValue() % 2) == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
