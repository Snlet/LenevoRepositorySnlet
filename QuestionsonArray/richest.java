package QuestionsonArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class richest {
    public static void main(String[] args) {
        int [][]ar = {{1,2,3} , {4,5,6}};

        System.out.println(maximumWealth(ar));
    }
    public static int maximumWealth(int[][] accounts) {
        int res = 0 ;
        for(int[] b:accounts){
            int a = 0;
            for(int acc_total :b){
                a+=acc_total;
            }
            if(a >res){
                res = a;
            }
        }
        return res;



//        int rich = 0;
//        for(int i =0 ; i < accounts.length-1 ; i++){
//            int sum2 = 0;
//            int sum1 = 0;
//
//
//            for(int j = 0 ; j < accounts[i].length ; j++){
//                sum1 += accounts[i][j];
//                sum2 += accounts[i+1][j];
//               rich = Math.max(rich , Math.max(sum1 , sum2));
//
//            }
//
//        }
//
//
//        return rich;
//


//        int a[] = new int[accounts.length];
//        ArrayList<Integer> list = new ArrayList<>(accounts.length);
//
//        for(int i =0 ; i < accounts.length ; i++){
//            int sum = 0;
//            for(int j = 0 ; j < accounts[i].length ; j++){
//               sum += accounts[i][j];
//            }
//            list.add(sum);
//        }
//
////        int index = list.indexOf(Collections.max(list));
//        return Collections.max(list);

    }


}
