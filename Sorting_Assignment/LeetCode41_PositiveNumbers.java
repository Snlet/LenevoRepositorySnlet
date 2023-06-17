package Sorting_Assignment;

import java.util.Arrays;

public class LeetCode41_PositiveNumbers {
    public static void main(String[] args) {
        int[] ar={7,8,10,11};
        System.out.println(sort(ar));
//        sort(ar);
//        System.out.println(Arrays.toString(ar));
    }

    public static int sort(int []ar){
        int i=0;

        while(i < ar.length){
            int correct = ar[i] - 1;

            if(ar[i] <=ar.length && ar[i]>0 && ar[i] != ar[correct] ){
                swap(ar,i,correct);
            }else{
                i++;
            }
        }

        for(int j=0;j < ar.length ; j++){
            if(ar[j]!=j+1){
                return j+1;
//                System.out.println(ar[j]);
            }
        }
        return ar.length+1;
    }

    public static void swap(int []ar ,int i ,int coreect){
        int temp = ar[i];
        ar[i] = ar[coreect];
        ar[coreect] = temp;
    }
}
