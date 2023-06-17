package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode34 {
    public static void main(String[] args) {
        int ar[] = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(ar,target)));
    }
    public static int[] searchRange(int[] nums, int target) {

        boolean islowerbound = true;
        int a[] = new int[2];
        a[0] = binary(nums,target,islowerbound);
        // a[1] = binary(nums,target,islowerbound);

        if(nums.length == 0){
            return new int[] {-1,-1};
        }else{
            if(a[0] != -1){
                islowerbound = false;
                a[1] = binary(nums,target,islowerbound);
                return a;
            }else{
                return new int[] {-1,-1};

            }


        }
    }

    public static int binary(int[] ar, int target,boolean islowerbound){
        int ans =0;
        int start = 0;
        int end = ar.length-1;

        while(start <= end){
            int m = start + (end-start)/2;

            if(ar[m] < target){
                start = m+1;
            }else if(ar[m] > target){
                end = m -1;
            }else{
                ans = m;
                 if(islowerbound){
                    end=m-1;
                }else{
                    start=m+1;
                }
            }


        }
        return ans;
    }
}
