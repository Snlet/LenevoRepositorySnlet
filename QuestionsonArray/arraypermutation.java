package QuestionsonArray;

import java.util.Arrays;
import java.util.Scanner;

public class arraypermutation {
    public static void main(String[] args) {
    int l = 6;
    int nums[] = new int[l];
    Scanner input = new Scanner(System.in);


    for(int i = 0 ; i < nums.length ; i++ ){
        nums[i] = input.nextInt();
    }
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i  =0 ; i < nums.length ; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;

    }

}
