package BinarySearch;

public class leetcode540redo {
    public static void main(String[] args) {
//        int ar[] = {1,1,2,3,3,4,4,8,8};
//        int ar[] ={3,3,7,7,10,11,11};
//        int ar[] = {1};
//        int ar[] = {1,1,2};


//        int []ar = {1,1,2,2,3};

        int []ar = {1,2,2,3,3};


        System.out.println(singleNonDuplicate(ar));
    }
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }else{
            int ans= 0;
            int start =0;
            int end = nums.length-1;

            while(start <= end){

                int mid= start+(end-start)/2;
                if(mid+1<nums.length && nums[mid]==nums[mid+1]){
                    mid++;
                }

                if(check(nums,mid) && (mid%2 == 0)){
                    end = mid-1;
                }else if(check(nums,mid) && (mid%2==1)){
                    start = mid+1;
                }else if((mid+1 < nums.length) && (nums[mid]==nums[mid+1])){
                    end= mid-1;

                }else{
                    return nums[mid];
                }
            }
            return ans;
        }
    }

    public static boolean check(int [] ar, int m){
        if((m-1>=0)&&(ar[m] ==ar[m-1]) ){
//            || ar[m] == ar[m+1]
            return true;
        }else{
            return false;
        }
    }
}
