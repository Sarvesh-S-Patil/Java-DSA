import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {-1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for(int i=0;i< arr.length;i++){
            int end = arr.length-(i+1);
            int maxIndex = max(arr, 0,end);
            swap(arr,maxIndex,end);
        }
    }

    public static int max(int[] arr, int start, int end){
        int maxIndex=start;
        for(int j=start;j<=end;j++){
            if(arr[maxIndex]< arr[j]){
                maxIndex=j;
            }
        }
        return maxIndex;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
