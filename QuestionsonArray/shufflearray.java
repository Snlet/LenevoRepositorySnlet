package QuestionsonArray;

import java.util.Arrays;

public class shufflearray {
    public static void main(String[] args) {
        int []nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums , n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int i = 1;
        int j = n ;
        while(j < nums.length-1){
            int temp = nums[j];
            for(int h = j -1 ; h>=i ; h--){
                nums[h+1] = nums[h];
            }
            nums[i] = temp;
            i +=2;
            j++;
        }
        return nums;
    }
}


