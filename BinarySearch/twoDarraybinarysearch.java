package BinarySearch;

import java.util.Arrays;

public class twoDarraybinarysearch {

    public static void main(String[] args) {
        int[][]ar = {{1,2,3,4} ,{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 11;
        System.out.println(Arrays.toString(search(ar,target
        )));
    }
    public static int[] search(int[][]ar ,int target){

        int r = 0;
        int c = ar.length-1;

        while(r<ar.length && c>=0){

            if(ar[r][c]==target){
                return new int[] {r,c};
            }else if(ar[r][c] > target){
                c--;
            }else{
                r++;
            }
        }

        return new int[] {-1,-1};
    }
}
