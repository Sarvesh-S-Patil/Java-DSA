package com.sarvesh;

public class LinearSearch {
    public static void main(String[] args) {
        int[] marks = {98,95,92,81,71,95,94};
        int target = 85;
        System.out.println(LinearSearch1(marks,target));

    }

    static int LinearSearch1(int[] arr , int target){
        if(arr.length == 0 ){
            return -1;
        }
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}


