package com.sarvesh;

import java.util.Arrays;

public class LinearSearch2dArray {
    public static void main(String[] args) {
        int[][] records = {
                {656,258,323},
                {458,253,696},
                {2,5,3}
        };
        int[] res = Search(records,3);
        System.out.println(Arrays.toString(res));
    }

    static int[] Search(int[][] records, int target) {
        if(records.length == 0){
            return new int[]{-1,-1};
        }
        for (int i =0; i < records.length; i++){
            for (int j = 0 ; j < records[i].length;  j++){
                if(records[i][j] == target ){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
