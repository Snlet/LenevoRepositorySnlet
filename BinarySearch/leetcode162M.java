package BinarySearch;

public class leetcode162M {
    public static void main(String[] args) {
//        int []ar = {1,2,3,1};
        int []ar = {1,2,1,3,5,6};
//        int [] ar = {6,5,4,3,2,3,2};
        System.out.println(findPeakElement(ar));
    }

    public static int findPeakElement(int[] nums) {
        int peak=-1;
        if(nums.length == 1){
            return  0;
        }
        if(nums.length ==2){
           if(nums[0] > nums[1]){
               return 0;
           }else{
               return 1;
           }
        }

        if(nums.length >2){
            peak = -1;

            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {
                int mid = (start + (end - start) / 2);
                peak = mid;
                if (((mid > start) && (nums[mid - 1] < nums[mid])) && ((mid < nums.length-1)&&(nums[mid + 1] < nums[mid]))) {
                    return mid;
                }
                if ((mid < nums.length-1)&&(nums[mid + 1] > nums[mid])) {
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }

            }
            return peak;
        }
        return peak;
    }
}

