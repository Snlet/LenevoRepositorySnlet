package QuestionsonArray;

import java.util.ArrayList;
import java.util.Arrays;


public class stringconcatanation {
    public static void main(String[] args) {
        int []nums = {1 ,2 ,3};
         System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {

        ArrayList<Integer> list =new ArrayList<>();

        int i = 0;

        while(i < 2){
            for(int ele:nums){
                list.add(ele);
            }
            i++;
        }
        int []ans = new int[list.size()];

        for(int j = 0; j<list.size() ; j++){
            ans[j] = list.get(j);
        }
        return ans;








//        int []ans = new int[(nums.length)*2];
//
//
//
//        for(int i = 0 ; i < nums.length ; i++){
//            ans[i] = nums[i];
//        }
//        for(int i = nums.length ; i < nums.length*2 ; i++){
//            ans[i] = nums[i - nums.length];
//        }
//
//        return ans;


    }
}
