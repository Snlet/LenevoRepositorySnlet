package BinarySearch;

import java.util.Arrays;

public class rotatedarraybinarysearchRBS {
    public static void main(String[] args) {
        int []ar = {3,4,5,6,7,1,2};
        int target = 2;

        int []ar1 ={1,2,3,4,5,6,7};



        System.out.println(check(ar1,target));


    }
    public static int check(int ar[] , int target){
        int pivot = findpivot(ar);

        if(pivot != -1){
            if(target == ar[pivot]){
                return 1;
            }
            if(target < ar[pivot]){
                return binarysearch(ar,target,0,pivot);
            }else{
                return binarysearch(ar,target,pivot+1,ar.length-1);
            }
        }else{
            return binarysearch(ar,target,0,ar.length-1);
        }


    }

    public static int binarysearch(int []ar,int target,int s ,int e){
        int start =s;
        int end = e;

        while(start <=end){
            int mid = start + (end-start)/2;

            if(target > ar[mid]){
                start = mid+1;
            }else if(target < ar[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
     return -1;
    }
    public static int findpivot(int []ar){
        int start = 0;
        int end= ar.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(mid < end && ar[mid] > ar[mid+1]){
                return mid;
            }
            if(mid > start && ar[mid] < ar[mid-1]){
                return mid-1;
            }
            if(ar[start] >= ar[mid]){
                end = mid-1;
            }
            if(ar[start] < ar[mid]){
                start= mid+1;
            }

        }

        return -1;
    }
}
