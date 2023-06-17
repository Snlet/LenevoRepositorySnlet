package BinarySearch;

import java.util.Arrays;

public class matrixbinaryimplementationin2d {
    public static void main(String[] args) {
        int[][]ar = {{10,20,30,40}
                    , {15,125,35,45},
                      {28,29,37,49},
                     {33,34,38,50}};

        int target = 37;

        System.out.println(Arrays.toString(search(ar,target)));
    }

    public static int[] search(int[][]ar , int target){
        int r = 0;
        int c = ar.length-1;

        while(r < ar.length && c >=0){

            if(ar[r][c] == target) {
                return new int[]{r, c};
            }else if(ar[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
