package QuestionsonArray;

import java.util.Arrays;
import java.util.Random;

public class randomnumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(1)));
    }
    public static int[] sumZero(int n) {
        int [] ar = new int[n];
        if(n ==0){
            int[] ar1 = new int[1];
            ar1[0] = 0;
            return ar1;
        }else if(n %2 == 0){
//            int [] ar = new int[n];
            for(int i = 0 ; i < n/2 ; i++){
                Random rand = new Random();
                int ran =  rand.nextInt(1000);
                ar[i] = ran;
                ar[n-1-i] = 0 - (ran);
            }
//            return ar;
        }
        else if(n%2 != 0){
//            int []ar = new int[n];
            if(n==1){
                int []ar2  = new int[1];
                ar2[0] = 0;
                return ar2;
            }else {
                for (int i = 0; i < Math.floorDiv(n, 2); i++) {
//                int []ar = new int[];
                    Random rand = new Random();
                    int ran = rand.nextInt(1000);
                    ar[i] = ran;
                    ar[n - 1 - i] = 0 - (ran);

                }
            }
        for(int ele :ar){
            System.out.print(" "+ele);
        }

        }
      return ar;
    }

}
