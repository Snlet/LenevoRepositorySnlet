package BinarySearch;

import java.util.Arrays;

public class leetcode540 {
    public static void main(String[] args) {
    int []ar = {3,3,7,7,10,11,11};
//    int []ar = {1,1,2,3,3,4,4,8,8};
        System.out.println((singleNonDuplicate(ar)));

    }
    public static int singleNonDuplicate(int[] nums) {
    int start =0;
    int end = nums.length-1;
    int flag=0;
    int c = 0;

    while(start <= end){
        int mid = start + (end-start)/2;

        if(nums[mid]==nums[mid-1] && mid%2 ==0){
            end= mid-1;
//            flag =0;
//            c = 0;
        }else if(nums[mid] ==nums[mid-1] && mid%2==1){
            start = mid+1;
//            flag = 1;
        }else{
            if(c == 0){
            return nums[mid];
            }
            else if(flag ==1){
                return nums[mid-2];
            }
        }
    }
        return -1;
    }
}
