package BubbleSortAKAexchangesort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]ar = {4,5,3,2,1};
        selectionsort(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void selectionsort(int []ar){

        for(int i =0 ;i < ar.length-1 ; i++){

            int last = ar.length-1-i;
            int maxIndex = findMaxIndex(ar,last);

            swap(ar,maxIndex,last);
        }

    }

    public static int findMaxIndex(int[] ar,int last){
        int max=0;
        for(int i=1; i <= last ; i++){
            if(ar[max] <ar[i]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int []ar ,int maxIndex,int end){
        int temp = ar[end];
        ar[end] = ar[maxIndex];
        ar[maxIndex] = temp;
    }

}
