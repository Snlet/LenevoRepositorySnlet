package BinarySearch;

import java.util.ArrayList;

public class specialelementinx {
    public static void main(String[] args) {
//        int []nums = {3,5};
//        int []nums={0,0};
        int[]nums = {0,4,3,0,4};

        System.out.println(specialArray(nums));

    }

    public static int specialArray(int[] nums) {
        int x = nums.length;
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for(int ele: nums){
            if(ele != 0){
                ar.add(ele);
            }
        }

        System.out.println(ar);

        int []num = new int[ar.size()];
        int d=0;
        while(d < num.length){
            num[d] = ar.get(d);
            d++;
        }
    
        for(int i=0; i < num.length ; i++){
            if(x > num[i]){
                return -1;
            }
        }
        return x;
    }
}
