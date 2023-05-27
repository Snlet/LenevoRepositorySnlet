package QuestionsonArray;

import java.util.Arrays;

public class targetarray {
    public static void main(String[] args) {
        int []nums= {0,1,0};
        int []index = {0,1,0};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int []target = new int[nums.length];
        int temp;

        for(int i = 0 ; i < index.length ; i++ ){
            temp = index[i];
            if(target[temp] == 0){
                target[temp] = nums[i];
            }else{
                for(int z = target.length -1 ; z > temp ; z-- ){
                    int var = target[z];
                    target[z] = target[z-1];
                }
                target[temp] = nums[i];
            }
        }
        return target;

    }
}
