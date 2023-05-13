package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class weatl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w[][] = new int[3][3];

        for(int i = 0 ;i < w.length ; i++){
            for(int  j = 0  ;j < w[i].length ; j++){
                w[i][j]= input.nextInt();
            }
        }

//        view(w);
        result(w);
    }

    public  static void result(int [][]w) {
        int []wealth_collectively = new int[w.length];

        for (int i = 0; i < w.length; i++) {
            int wlth = 0;
            for (int j = 0; j < w[i].length; j++) {
                wlth  = wlth + w[i][j];
            }

            wealth_collectively[i] = wlth;
        }

//        System.out.println(Arrays.toString(wealth_collectively));

        int max = wealth_collectively[0];
        int position =0;

        for(int i = 0 ; i< wealth_collectively.length  ; i++){
            if(max < wealth_collectively[i]){
                    max = wealth_collectively[i];
                    position = position+ i;

            }
        }

        System.out.println("the person at position "+ (position+ 1) + " is richest ");

    }


   static void view(int [][]w){
       for(int i = 0 ;i < w.length ; i++){
           for(int  j = 0  ;j < w[i].length ; j++){
               System.out.print(w[i][j]+ " ");
           }
           System.out.println();
       }
   }

}
