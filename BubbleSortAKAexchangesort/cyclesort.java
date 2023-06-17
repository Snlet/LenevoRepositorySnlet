package BubbleSortAKAexchangesort;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int []ar = {3};
        cyclesort(ar);
        System.out.println(Arrays.toString(ar));

    }

    public static void cyclesort(int[] ar){

        for(int i=0; i<ar.length-1;i++){
            if(i != ar[i]-1){
                swap(ar,i);
                i--;
            }
        }
    }

    public static void swap(int []ar,int index){
        int coorectposition = ar[index]-1;

        int temp = ar[index];
        ar[index] = ar[coorectposition];
        ar[coorectposition] = temp;

                //index = value-1;




    }


}
