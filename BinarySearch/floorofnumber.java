package BinarySearch;

public class floorofnumber {
    public static void main(String[] args) {
        int [] ar1 = {2,4,8,9,16,17};
        int target1  = 5;

        System.out.println(floorofnumber(ar1 , target1));
    }
    public static int floorofnumber(int []ar , int target){
        System.out.println(ar.length);
        int start =0 ;
        int end = ar.length-1;

        if(ar[0] > target){
            return -1;
        }else {
            while (start <= end) {
                int mid = (start + end) / 2;

                if (target < ar[mid]) {
                    end = mid - 1;
                } else if (target > ar[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
                System.out.println(mid);
            }
            return ar[end];
        }
    }
}
