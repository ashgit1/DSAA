package com.ashish.array;

/*
Java program to Find Largest and Smallest Number in an Array
* */
public class FindLargestSmallestNumberMain {

    public static void main(String[] args) {

        // array of some pre-defined numbers
        int arr[] = new int[]{12, 23, 8, 45, 67, 98, 32, 6, 234, 1, 923};

        //make the first element as the smallest as well as the largest
        int smallest = arr[0];
        int largest = arr[0];

        //iterate through the array and compare the elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

}
