package QuestionsonArray;

import java.util.ArrayList;
import java.util.Arrays;

public class candyprobelm {
    public static void main(String[] args) {
    int []candies = {2,3,5,1,3};
    int extraCandies = 3;


//        return list;



//        System.out.println(Arrays.toString(kidsWithCandies(candies , extraCandies)));
        kidsWithCandies(candies , extraCandies);
    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean b = false;
        ArrayList<Boolean> list = new ArrayList<>(candies.length);

//        int []a = new int[candies.length];
//        for(int i = 0 ; i < candies.length ; i++){
//            a[i] = candies[i];
//        }

        int []a = candies;

        for(int i = 0  ; i < candies.length ; i++){
            a[i] +=extraCandies;
            for(int j =0 ; j< candies.length ; j++){
                if(a[i] >=a[j]){
                    b = true;
                }else{
                    b = false;
                    break;
                }

            }
            list.add(b);
            a[i] -=extraCandies;
        }
        System.out.println(list);
        return list;


    }
}
