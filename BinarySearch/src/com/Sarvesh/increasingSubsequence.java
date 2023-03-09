package com.Sarvesh;

public class increasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,5};
        boolean res = isPossible(arr);
        System.out.println(res);

    }

    static boolean isPossible(int[] arr) {
        int checklength = 1;
        boolean isValid = true;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i-1]+1 == arr[i]){
                checklength++;
                isValid=true;
            }
            else{
                if(checklength < 3){
                    return false;
                }
                checklength=1;
                isValid=false;
            }
        }
        if(checklength < 3){
            return false;
        }
        return isValid;
    }
}
