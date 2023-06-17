package BinarySearch;

public class elementininfinitearray {
    public static void main(String[] args) {
        int[] ar = {12,13,14,15,16,34,35,56,67,68};
        int target = 35;

        System.out.println(ans(ar,target));

    }
    public static int ans(int ar[] , int target){
        int start =0;
        int end = 1;

        while(target > ar[end]){
            int temp = end+1;
            end = end + (end-start+1)*2;
            start = temp;      }
        return binarysearch(ar,target,start,end);
    }

    public static int binarysearch(int []ar , int target ,int start , int end){

        int mid = start + (end-start)/2;
        while(start <=end){
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

}

