package com.ashish.array;

public class MissingNumberMain {

    public static void main(String[] args){

        int arr1[] = new int[]{5,1,2,3};
        System.out.println("Missing number in arr1: " +returnMissingNumber(arr1));
        int arr2[] = new int[]{1,2,3,4,6,7};
        System.out.println("Missing number in arr2: " +returnMissingNumber(arr2));
    }

    public static int returnMissingNumber(int arr[]){

        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        int arrSum=0;
        for(int i=0; i < arr.length; i++){
            arrSum+=arr[i];
        }
        return (sum-arrSum);
    }

}
