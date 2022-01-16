package com.ashish.array;

/*
Separate odd and even numbers in an array :
 */
public class SeparateOddEvenMain {

    public static void main(String[] args){
        int arr[]={11, 17, 19, 21, 22, 64, 32, 90, 100};
        System.out.println("Original Array:");
        showArray(arr);
        arr=separateEvenOddNumbers(arr);
        System.out.println("\nArray after Separating Odd and Even Numbers:");
        showArray(arr);
    }

    private static int[] separateEvenOddNumbers(int[] arr) {
        int left=0;
        int right=arr.length-1;
        for(int i = 0; i < (arr.length); i++){
            while(arr[left]%2 == 0){
                left++;
            }
            while(arr[right]%2 == 1){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            System.out.println("\nIteration: " + (i+1));
            showArray(arr);
//            if(i>(arr.length/2)){
//                break;
//            }
        }
        return arr;
    }

    private static void showArray(int[] arr) {
        for(int i = 0; i < (arr.length); i++){
            System.out.print(arr[i] + " ");
        }
    }
}