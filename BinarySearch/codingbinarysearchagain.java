package BinarySearch;

public class codingbinarysearchagain {
    public static void main(String[] args) {
        int []ar = {10,20,30,40,50,60,70,80,90,100,101};
        int target = 20;

        System.out.println(binarysearch(ar,target));
    }
    public static int binarysearch(int[]ar , int target){
        int start = 0;
        int end = ar.length-1;

        while(start <= end){

            int mid = start + (end -start)/2;

            if(target > ar[mid]){
                start = mid+1;
            }else if(target < ar[mid]){
                end = mid-1;
            }else{
                return 1;
            }

        }
        return -1;
    }
}
