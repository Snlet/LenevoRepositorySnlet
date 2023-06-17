package BinarySearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersectionofarrya {
    public static void main(String[] args) {
//        int[]nums1= {1,2,2,1};
//        int []nums2 = {2,2};
//
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};


        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

            HashSet<Integer> hs = new HashSet<>(nums1.length);

            for(int i =0 ;i < nums1.length ; i++){
                hs.add(nums1[i]);
            }

            HashSet<Integer> h= new HashSet<>();

            for(int j =0;j< nums2.length ;j++){
                if(hs.contains(nums2[j])){
                    h.add(nums2[j]);
                }
            }

            int ar[] = new int[h.size()];
            int k = 0;
            for(int ele:h){
                ar[k++] = ele;
            }
            return ar;















    //        int []ar = new int[Math.min(nums1.length , nums2.length)];
            ////ArrayList<Integer> ar = new ArrayList<>();
    //        // new int[Math.min(nums1.length , muns2.length)];
    //        int []lar = nums1;
    //        int []sar = nums2;
    //
    //        if(nums1.length > nums2.length){
    //            lar = nums1;
    //            sar = nums2;
    //        }else{
    //            lar = nums2;
    //            sar = nums1;
    //        }
    //
    //        int j=0;
    //        for(int i =0 ;i < lar.length ; i++){
    //
    //            if(lar[i] == sar[j]){
    //                ar.add(lar[i]);
    //                if(j+1 <sar.length){
    //                j++;}
    //            }
    //
    //        }
    //
    //        return ar;
    }
}
