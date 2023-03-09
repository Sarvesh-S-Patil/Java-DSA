package com.Sarvesh;

import java.util.Scanner;

public class BadVersion {
    public static void main(String[] args) {
       // System.out.println("Enter total versions and last bad version : ");
        //Scanner sc = new Scanner(System.in);
        int n = 5;
        int bad = 4;
        int firstBad = firstBadVersion(n,bad);
        System.out.println(firstBad);




    }
        static boolean isBadVersion(int n,int bad, int check){
            if(check >= bad){
                return false;
            }
            return true;

        }

        static int firstBadVersion(int n,int bad) {
            int start = 0;
            int end = n;
            if(!isBadVersion(n,bad,0)){
                return 0;
            }
            while(start <= end){
                int mid = start + (end-start)/2;
                boolean isValid = isBadVersion(n,bad,mid);
                boolean isValid2 = isBadVersion(n,bad,mid-1);
                if(isValid != isValid2){
                    return mid;
                }
                if(isValid){
                    start=mid+1;
                }
                else{
                    end =mid;
                }
            }

            return start;
        }

}
