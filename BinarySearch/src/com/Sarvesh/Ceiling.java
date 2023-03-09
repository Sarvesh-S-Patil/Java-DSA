package com.Sarvesh;

public class Ceiling {
    public static void main(String[] args){
        int arr[] = {-35,-5,-2,0,4,6,25,55,678};
        int ans = ceil(arr , 50);
        System.out.println(ans);

    }

    // Ceiling function gives the index of the  least element greater than or equal to a number in array

    static  int ceil(int[] arr ,int target ){
        int start = 0;
        int end = arr.length-1;
        if(target > arr[arr.length-1]){
            return -1;
        }
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
        return arr[start];
    }
}
