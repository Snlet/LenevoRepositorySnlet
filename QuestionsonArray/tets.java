package QuestionsonArray;

import java.util.Arrays;
import java.util.HashSet;

public class tets {

    public static void main(String[] args) {
    int []ar = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,3,1,2,3,4,5,4};
        System.out.println(Arrays.toString(returningarray(ar)));
    }

    public static int[] returningarray(int ar[]){

       HashSet<Integer> set = new HashSet<>();

        for(int i =0 ; i < ar.length ; i++){
            
            set.add(ar[i]);
        }
        System.out.println(set);


        int []newar = new int[set.size()];

        String []arr = new String[set.size()];

        set.toArray(arr);

        System.out.println("displaying array: ");

        System.out.println(Arrays.toString(ar));

        return newar;
    }
    }

