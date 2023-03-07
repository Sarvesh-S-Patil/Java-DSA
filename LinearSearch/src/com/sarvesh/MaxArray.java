package com.sarvesh;

import java.util.Arrays;

public class MaxArray {

    public static void main(String[] args) {
        int[] arr = {22,13,45,874,65,75,44,-14,0,22};
        int[] maxmin = MaxAndMin(arr);
        System.out.println(Arrays.toString(maxmin));
    }

    static int[] MaxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return new int[]{max,min};
    }
}
