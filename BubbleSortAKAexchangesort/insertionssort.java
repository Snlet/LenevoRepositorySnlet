package BubbleSortAKAexchangesort;

import java.util.Arrays;

public class insertionssort {
    public static void main(String[] args) {
        int[]ar = {5,4,3,2,1};
        insertsort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void insertsort(int []ar){
        boolean swapped=false;
        for(int i = 0; i <= ar.length-2 ; i++){
            for(int j = i+1 ;j >0;j--){
                if(ar[j]<ar[j-1]){
                    swap(ar,j);
                    swapped = true;
                }
            }
            if(!(swapped)){
                break;
            }
        }
    }

    public static void swap(int[]ar , int j){
        //swapwithj
        int temp = ar[j];
        ar[j] = ar[j-1];
        ar[j-1] = temp;

    }

}
