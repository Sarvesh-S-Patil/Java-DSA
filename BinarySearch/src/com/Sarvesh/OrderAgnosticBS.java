package com.Sarvesh;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {-1,0,5,6,59};
        int[] arr2 = {59,45,6,0,-2,-8,-98};
        int ans1 = orderAgnosticBS(arr1,0);
        System.out.println(ans1);
        System.out.println(orderAgnosticBS(arr2,59));

    }

    static int orderAgnosticBS(int[] arr , int target ){
        int start =0;
        int end  = arr.length-1;
        boolean isAsc = arr[start]<arr[end] ;
        while (start <= end) {
            int mid = start+ (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(target > arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }

            }

        }
        return -1;

    }
}
