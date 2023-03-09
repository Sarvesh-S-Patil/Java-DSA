package com.Sarvesh;

////public class InfiniteArraySearch {
////    public static void main(String[] args) {
////        int[] check = {1,2,3,4,5,6,7,8,9};
////        int ans = infiniteSearch(check,9);
////        System.out.println(ans);
////
////    }
////
////    static int infiniteSearch(int[] arr , int target ){
////        int start = 0;
////        int end = 1;
////        while(target > arr[end]){
////            int temp = end;
////            end = end + (end -start + 1)*2;
////            start = temp;
////
////        }
////        int ans = binarySearch(arr,target,start,end);
////        return ans;
////    }
////
////    static int binarySearch(int[] arr , int target,int start , int end){
////        while (start <= end) {
////            int mid = start + (end-start)/2;
////            if( target < arr[mid]){
////                end = mid -1 ;
////            }
////            else if( target > arr[mid]){
////                start = mid+1;
////            }
////            else if (arr[mid] == target) {
////                return mid;
////            }
////        }
////        return -1;
//    }
//}
