package BinarySearch;

public class leetcode33 {
    public static void main(String[] args) {
        int[]ar = {4,5,6,7,0,1,2};
        int target = 1;
        int m = pivot(ar);
//        System.out.println(m);

        if(m ==-1){
            System.out.println( binarysearch(ar,target,0,ar.length-1));
        }else {
        System.out.println(search(ar,target,m));
        }







    }
    public static int search(int[]ar,int target,int m){
        int pivot = m;
        if(target == ar[m]){
            return pivot;
        } else if (target < ar[pivot] && target < ar[ar.length-1]) {
            return binarysearch(ar,target,pivot,ar.length-1);
        }else{
            return binarysearch(ar,target,0,pivot-1);
        }

    }

    public static int binarysearch(int []ar , int target,int s,int e){

        int start = s;
        int end = e;

        while (start <=  end){

            int mid = start+(end-start)/2;

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
    public static int pivot(int[] ar){
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
//
        return -1;
//
//
//
//
//
//
//
//
//
//
//
//
//
//        int pivot = -1;
//
//        int start = 0;
//        int end = ar.length-1;
//
//        while(start<=end){
//            int mid= (start+end)/2;
//
//            if(ar[mid] <= ar[start]){
//                start = mid+1;
//            }else if(ar[mid] > ar[start]){
//                end = mid-1;
//            }
//            else if(mid < end && ar[mid] > ar[mid+1] ){
//                pivot = mid;
//                return pivot;
//            }else if(mid >  start && ar[mid-1] > ar[mid]){
////                ;
//                pivot  = mid-1;
//                return pivot;
//            }
//        }
//
//
//        return pivot;
    }
}
