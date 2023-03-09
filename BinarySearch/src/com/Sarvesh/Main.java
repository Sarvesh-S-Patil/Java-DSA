package com.Sarvesh;

public class Main {
    public static void main(String[] args) {
        int [] marks = {-2,-1,0,4,5,6,12,19,66,85,22001};
        int index = binarySearch(marks,0);
        System.out.println(index);

    }

    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if( target < arr[mid]){
                end = mid -1 ;
            }
            else if( target > arr[mid]){
                start = mid+1;
            }
            else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}