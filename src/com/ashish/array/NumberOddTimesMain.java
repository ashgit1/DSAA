package com.ashish.array;

/*
Java program to find the element occurring odd number of times
 */
public class NumberOddTimesMain {

    public static void main(String[] args){
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        NumberOddTimesMain occur = new NumberOddTimesMain();
        System.out.println("Number which occurs odd number of times is : " + occur.getOddTimesElement(array));
    }

    private int getOddTimesElement(int[] array) {
        int result=0;
        for(int i=0; i < array.length; i++){
            System.out.print(result +" xor " + array[i]);
            result = result ^ array[i];
            System.out.print(" = " + result + "\n");
        }
        return result;
    }
    //Above algorithms solves the problem with O(n) time complexity and o(1) space complexity and this is the best solution for above program
}