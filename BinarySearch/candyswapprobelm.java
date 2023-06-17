package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class candyswapprobelm {
    public static void main(String[] args) {
//        int []aliceSize = {1,1};
//        int []bobSize = {2,2};

//        int []aliceSize = {1,2};
//        int []bobSize = {2,3};

//        int []aliceSize = {2};
//        int []bobSize = {1,3};

        int []aliceSize = {35,17,4,24,10};
        int []bobSize = {63,21};

        System.out.println(Arrays.toString(fairCandySwap(aliceSize  , bobSize)));

    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int i=0;
        int j=0;
        ArrayList<Integer> ar= new ArrayList<Integer>();

        while(i <aliceSizes.length && j < bobSizes.length){
            int temp =aliceSizes[i];
            aliceSizes[i]=  bobSizes[j];
            bobSizes[j] = temp;

            int alicesum =sum(aliceSizes);
            int bobsum = sum(bobSizes);



            if(alicesum < bobsum){
                temp =aliceSizes[i];
                aliceSizes[i]=  bobSizes[j];
                bobSizes[j] = temp;
                j++;


            }else if(alicesum > bobsum){
                temp =aliceSizes[i];
                aliceSizes[i]=  bobSizes[j];
                bobSizes[j] = temp;
                i++;


            }else{
                ar.add(bobSizes[j]);
                ar.add(aliceSizes[i]);
                break;
            }


        }
        int []ans = new int [ar.size()];
        int l = 0;
        for(int z =0 ; z<ar.size() ;z++){
            ans[z] = ar.get(z);
        }
        return ans;

    }
    public static int sum(int []ar){
        int sum= 0;
        int i=0;
        while(i < ar.length){
            sum = sum+ar[i];
            i++;
        }
        return sum;
    }
}
