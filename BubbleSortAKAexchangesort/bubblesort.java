package BubbleSortAKAexchangesort;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
//        int []ar = {5,4,3,2,1};
        int[]ar = {1,2,3,4,5};
        bubblesort(ar);
        System.out.println(Arrays.toString(ar));

    }

    public static void bubblesort(int []arr){
        for(int i =0 ; i < arr.length-1;i++){
            boolean swapped = false;
            for(int j =1 ; j < arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }

        }
    }
}
