package BinarySearch;

public class countherotaionofarray {
    public static void main(String[] args) {
        int []ar = {1,2,3,0};
        System.out.println(rotationcount(ar)+1);
    }

    public static int rotationcount(int[] ar){

        int start =0;
        int end = ar.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if(mid < end && ar[mid] > ar[mid+1]){
                return mid;
            }if(mid  > start && ar[mid] < ar[mid-1]){
                return mid-1;
            }
            if(ar[start] < ar[mid]){
                start = mid+1 ;

            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}
