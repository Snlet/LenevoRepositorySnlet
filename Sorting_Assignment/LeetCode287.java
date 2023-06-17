package Sorting_Assignment;

import java.util.ArrayList;

public class LeetCode287 {
    public static void main(String[] args) {
        int ar[]  ={1,1,2};
        System.out.println(findduplicatnumeber(ar));

    }

    public static ArrayList<Integer> findduplicatnumeber(int []ar){
        int i =0;
        ArrayList<Integer>  list = new ArrayList<>();


        while(i < ar.length){
            int correct = ar[i]-1;

            if(ar[i] != ar[correct]){
                swap(ar,i ,correct);
            }else{
                i++;
            }
        }

        return list;
    }

    public static void swap(int [] ar ,int i, int correct){
        int temp = ar[i];
        ar[i] = ar[correct];
        ar[correct] = temp;
    }
}
