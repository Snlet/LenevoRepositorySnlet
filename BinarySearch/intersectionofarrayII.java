package BinarySearch;

import java.util.Arrays;

public class intersectionofarrayII {
    public static void main(String[] args) {

//        int nums1[] = {4,9,5};
//        int nums2[] = {9,4,9,8,4};

        int nums1[] = {2,1};
        int nums2[] = {1,1};

//        int [] nums1 = {1,2};
//        int [] nums2 = {2,1};


        System.out.println(Arrays.toString(intersect(nums1,nums2)));

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        System.out.println("min is"+ Math.min(nums1.length , nums2.length));
        int []ar = new int[Math.min(nums1.length , nums2.length)];

        int k =0;
        for(int i = 0 ;i < nums1.length;i++){
            for(int j =0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    ar[k++] = nums1[i];
                }
            }
        }

        return ar;



//        int []lar = nums1;
//        int []sar = nums2;
//
//        if(nums1.length >= nums2.length){
//            lar = nums1;
//            sar = nums2;
//        }else{
//            lar = nums2;
//            sar = nums1;
//        }
//
//
//        int j=0;
//        while(j<sar.length) {
//            for (int i = 0; i < lar.length; i++) {
//
//                if (lar[i] == sar[j]) {
//                    ar[j] = lar[i];
//                    if (j + 1 < sar.length) {
//                        j++;
//                    }
//                }
//
//
//            }
//            j++;
//        }
//
//        int l =0;
//        for(int ele:ar){
//            if(ele !=0){l++;}
//        }
//
//        int ar1[] = new int[l];
//        int k = 0;
//        for(int ele:ar){
//            if(ele!=0){
//                ar1[k++]  =ele;
//            }
//        }
//
//        return ar1;
    }


}
