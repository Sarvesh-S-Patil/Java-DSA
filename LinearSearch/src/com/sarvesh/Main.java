package com.sarvesh;

public class Main {
    public static void main(String[] args) {
        int[] test = {1,4,5,45,65,44,89,91,22};
        int res = LinearSearch(test,45);
        System.out.println(res);
        System.out.println(LinearSearch2(test,89));
        System.out.println(LinearSearch3(test,545));
    }



// Linear Search Algorithm Code

    static int LinearSearch(int[] nums ,int target){
        if(nums.length==0){
            return -1;
        }
        for(int index =0; index < nums.length; index++){
            if(nums[index]==target){
                return index;
            }
        }

        return -1;

    }


    // Returns element if it is found else a constant value


    static int LinearSearch2(int[] nums ,int target){
        if(nums.length==0){
            return Integer.MAX_VALUE;
        }
        for (int num : nums) {
            if (num == target) {
                return target;
            }
        }

        return Integer.MAX_VALUE;

    }



    static boolean LinearSearch3(int[] nums ,int target){
        if(nums.length==0){
            return false;
        }

        for (int num : nums) {
            if (num == target) {
                return false;
            }
        }

        return false;

    }

}








