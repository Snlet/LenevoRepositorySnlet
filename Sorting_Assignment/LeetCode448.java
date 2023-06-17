package Sorting_Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode448 {
    public static void main(String[] args) {
//        int ar[] ={4,3,2,7,8,2,3,1};

        int []ar = {1,1};
        System.out.println(findingmissingelements(ar));
//        System.out.println(Arrays.toString(ar));
    }

    public static ArrayList<Integer> findingmissingelements(int []ar){
        int i = 0;

        while(i < ar.length){
            int correct = ar[i] -1;

            if(ar[i]<ar.length+1 && ar[i] != ar[correct]){
                swap(ar , i  ,correct);

            }else{
                i++;
            }

        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int j =0 ; j<ar.length ; j++){
            if(ar[j] != j+1){
                list.add(j+1);
            }
        }

        if(list.size() == 0){

            ArrayList<Integer> ar1 = new ArrayList<>();
            return ar1;
        }
        else{

            return list;
        }
    }

    public static void swap(int []ar ,int i ,int coreect){
        int temp = ar[i];
        ar[i] = ar[coreect];
        ar[coreect] = temp;
    }

}
