package BinarySearch;

public class leetcode81 {
    public static void main(String[] args) {
//        int ar[] = {4, 5, 6, 6, 7, 0, 1, 2, 4, 4};
//        int ar[] = {2,9,2,2,2};

//        int ar[] = {2,5,6,0,0,1,2};
//        int []ar = {1};
        int []ar = {1,0,1,1,1};


        int target = 0;
//        System.out.println(findpivot(ar));
        System.out.println(search(ar,target));
    }

    public static boolean search(int[] nums, int target) {
        int pivot = findpivot(nums);
        System.out.println(pivot);
        if(pivot !=-1 && target == nums[pivot]){
            return true;
        }

        if(pivot != -1){

            //search in left
            // if(target < nums[nums.length-1])

            if(target < nums[nums.length-1]){
                return binarysearch(nums,target,pivot,nums.length-1);
            }else{
                return binarysearch(nums,target,0,pivot);
            }

        }else{
            return binarysearch(nums,target,0,nums.length-1);
        }

    }

    public static int findpivot(int[] nums) {
        int pvt = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                pvt = mid - 1;
                return pvt;
            }
            if (mid < nums.length-1 && nums[mid + 1] < nums[mid]) {
                pvt = mid;
                return pvt;
            }

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {

                if (nums[start] > nums[start + 1]) {
//                    start >0 &&;
                    return start;
                }
                start++;
                if ( nums[end] > nums[end - 1]) {
//                    end < nums.length-1 &&;
                    return end;
                }
                end--;

                //checking if the array to left is sorted and not pivot in left is present
            } else if (nums[mid] > nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }


        }
    return pvt;
    }

    public static boolean binarysearch(int []ar,int target,int s ,int e){
        int start =s;
        int end = e;

        while(start <=end){
            int mid = start + (end-start)/2;

            if(target > ar[mid]){
                start = mid+1;
            }else if(target < ar[mid]){
                end = mid-1;
            }else{
                return true;
            }
        }
        return false;
    }


}
