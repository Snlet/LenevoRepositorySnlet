package Sorting_Assignment;

import java.util.Arrays;

public class leetcode645 {
    public static void main(String[] args) {
        int []ar = {1,2,2,4};
        System.out.println(Arrays.toString(findnumbers(ar)));
    }

    public static int[] findnumbers(int[] ar){
        int i=0;
        while(i < ar.length){
            int correct = ar[i]-1;
            if(ar[i] != ar[correct]){
                swap(ar,i,correct);
            }else{
                i++;
            }
        }

        for(int j =0;j< ar.length;j++){
            if(ar[j] != j+1){
                return new int[] {ar[j] , j+1};
            }
        }
        return new int[] {-1,-1};
    }

    public static void swap(int []ar ,int i ,int coreect){
        int temp = ar[i];
        ar[i] = ar[coreect];
        ar[coreect] = temp;
    }
}
