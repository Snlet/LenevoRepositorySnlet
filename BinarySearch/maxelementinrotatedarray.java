package BinarySearch;

public class maxelementinrotatedarray {
    public static void main(String[] args) {
        int []ar = {2,4,5,6,7,0,1};
        int pivot = -1;

        System.out.println(pivot(ar));
    }

    public static int pivot(int[]ar){
        int pivot =-1;

        int start =0;
        int end = ar.length-1;

        while(start <=end){
            int mid = (start+end)/2;

            if(mid < mid+1) {
                start = mid+1;
            }else if(mid>mid+1){
                end = mid-1;
            }else if(mid-1 > mid || mid > mid+1){
                pivot = mid-1;
            }
        }

        return pivot;
    }
}
