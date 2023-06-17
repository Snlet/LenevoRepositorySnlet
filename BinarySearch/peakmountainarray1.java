package BinarySearch;

public class peakmountainarray1 {
    public static void main(String[] args) {
        int[]ar = {0,2,1,0};
        System.out.println(usinglinearsearch(ar));

    }
    public static int usingbinarysearch(int []ar){
        int max =-1;
        int start = 0;
        int end = ar.length-1;

        while(start != end){
            int mid = start + (end-start)/2;
            if(ar[mid]> ar[mid+1]){
                end = mid;
            }else if(ar[mid] < ar[mid+1]){
                start = mid+1;
            }
        }
        return start;
    }
    public static int usinglinearsearch(int []ar){
        int index =-1;

        int max = Integer.MIN_VALUE;

        for(int i =0 ; i < ar.length ; i++){
            if(ar[i]> max){
                index =i;
                max = ar[i];
            }
        }
        return index;
    }
}
