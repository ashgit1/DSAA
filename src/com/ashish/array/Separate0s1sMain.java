package com.ashish.array;

import java.util.Calendar;
import java.util.Date;

/*
Code to separate 0's and 1's in an array
 */
public class Separate0s1sMain {

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0};
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        separate0s1sSolution1(arr);
        separate0s1sSolution2(arr);
    }

    private static void separate0s1sSolution1(int[] array) {
        Date startTime = Calendar.getInstance().getTime();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        // System.out.println("Count of 0 = " + count);
        // reinitialize the array elements with first count number of zeros and then remaining with 1's
        for (int i = 0; i < count; i++) {
            array[i] = 0;
        }
        for (int i = count; i < array.length; i++) {
            array[i] = 1;
        }

        System.out.println("Solution1: Array after separating 0's and 1's ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Date endTime = Calendar.getInstance().getTime();
        long difference = endTime.getTime() - startTime.getTime();
        long differenceSeconds = difference / 1000 % 60;
        System.out.println("Time for Solution1: " + differenceSeconds + " seconds");
    }

    private static void separate0s1sSolution2(int[] array) {
        Date startTime = Calendar.getInstance().getTime();
        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = (array.length - 1);
            while (array[left] == 0) {
                left++;
            }
            while (array[right] == 1) {
                right--;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        System.out.println("Solution2: Array after separating 0's and 1's ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Date endTime = Calendar.getInstance().getTime();
        long difference = endTime.getTime() - startTime.getTime();
        long differenceSeconds = difference / 1000 % 60;
        System.out.println("Time for Solution2: " + differenceSeconds + " seconds");
    }
}