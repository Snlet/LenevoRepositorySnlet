package BinarySearch;

public class minimumelementinrotatedarray {
    public static void main(String[] args) {
        int []ar = {3,4,5,6,7,0,1,2};

        System.out.println(findMin(ar));
    }
    public static int findMin(int[] nums) {
        int pivot = findingpivot(nums);
        return nums[pivot+1];
    }

    public static int findingpivot(int[] ar){
        int pivot=-1;

        int start =0;
        int end = ar.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(mid>start && ar[mid]<ar[mid-1]){
                return mid-1;
            }
            if(mid < end && ar[mid]>ar[mid+1]){
                return mid;
            }
            if(ar[start] >= ar[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return pivot;
    }
}
