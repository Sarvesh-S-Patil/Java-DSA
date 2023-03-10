import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] marks = {1,2,6,3,1};
        bubble(marks);
        System.out.println(Arrays.toString(marks));
    }

    public static void bubble(int[] arr){
        // for the loop to repeat n time (passes)
        for(int i=0;i< arr.length;i++){
            boolean swapped=false;
            // to compare neighbouring elements in each pass
            for(int j=1;j< arr.length-i;j++){

                if (arr[j-1] > arr[j]){
                    swapped = true;
                    int temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j] =temp;
                }
            }
            if(!swapped){
                break;
            }

        }
    }
}
