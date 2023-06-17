package QuestionsonArray;

import java.beans.PropertyEditorManager;
import java.util.Arrays;
import java.util.HashSet;

public class duplicteelementsinarray {
    public static void main(String[] args) {
        int [] ar = {1,1,2};
        System.out.println(removeDuplicates(ar));
    }
    public static int removeDuplicates(int[] nums) {
        int i =0;
        for(int j =0 ; j < nums.length ; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        for(int ele:nums){
            System.out.print(" "+ele+" ");
        }


        return i+1;
    }

}
