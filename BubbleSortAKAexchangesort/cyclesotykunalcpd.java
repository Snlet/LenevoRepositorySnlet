package BubbleSortAKAexchangesort;

import java.util.Arrays;

public class cyclesotykunalcpd {
    public static void main(String[] args) {
        int[]ar= {5,3,2,4,1};
        sort(ar);
        System.out.println(Arrays.toString(ar));

    }
    public static void sort(int [] ar){
        int i=0;
        while(i<ar.length){
            int correct =ar[i] -1;

            if(ar[i] != ar[correct]){
                swap(ar, i,correct);
            }else{
                i++;
            }
        }
    }

    public static void swap(int []ar , int i, int correct){

        int temp = ar[i];
        ar[i]=ar[correct];
        ar[correct] = temp;

    }

}
