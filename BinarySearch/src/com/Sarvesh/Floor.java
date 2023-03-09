package com.Sarvesh;

public class Floor {
    public static void main(String[] args){
        int arr[] = {-35,-5,-2,0,4,6,25,55,678};
        int ans = floor(arr , 54);
        System.out.println(ans);

    }

    // Floor function gives the index of the greatest element less than or equal to a number in array

    static  int floor(int[] arr ,int target ){
        int start = 0;
        int end = arr.length-1;
        while (start <= end ){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid-1;

            }
            else{
                start = mid+1;
            }
        }
        return arr[end];
    }
}
