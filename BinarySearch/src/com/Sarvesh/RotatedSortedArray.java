package com.Sarvesh;

public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {3,1,3};
        int ans = search(arr,3);
        System.out.println(ans);



    }

    static int search(int[] nums, int target) {
        int ans = -1;
        if(nums.length <=3){
            for(int i = 0; i <nums.length;i++){
                if(nums[i]== target){
                    return i;
                }
            }
            return ans;
        }
        int peak = findPivot(nums);

        ans = orderAgnosticBS(nums ,target ,0 ,peak, true );
        if(ans == -1){
            ans = orderAgnosticBS(nums ,target ,peak+1 ,(nums.length-1), true );

        }


        return ans;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(arr[start] == arr[mid] && arr[mid]== arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end;
                }
                end--;
            }

            else if(arr[start] < arr[mid] || arr[start] ==arr[mid] && arr[mid] > arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int[] nums ,int target ,int start ,int end , boolean isAsc ){
        while(start <= end ){
            int mid = start+ (end-start)/2;
            if(nums[mid] == target ){
                return mid;
            }
            if (isAsc){
                if(target < nums[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else{
                if(target < nums[mid]){
                    start= mid +1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
