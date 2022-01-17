package com.ashish.array;

/*
Element is the leader if it is greater than right side of elements.
 */
public class FindLeadersInArrayMain {

    public static void main(String[] args){
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        findLeadersInAnArrayBruteForce(arr);
    }

    private static void findLeadersInAnArrayBruteForce(int[] arr) {
        System.out.println("Finding leaders in an array using brute force : ");
        for(int i = 0; i < arr.length; i++){
            boolean isLeader=true;
            for(int j = (i+1); j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader)
                System.out.print(+i + " " + arr[i]+" ");
        }
        }
    }
