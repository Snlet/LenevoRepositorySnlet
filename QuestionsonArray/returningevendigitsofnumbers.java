package QuestionsonArray;

public class returningevendigitsofnumbers {
    public static void main(String[] args) {
        int[] nums = {121,345,2,6};

        System.out.println(findNumbers(nums));

    }
    public static int findNumbers(int[] nums) {

        int evendigits =0 ;

        for(int i = 0  ; i < nums.length ; i++){
            int n = nums[i];
            int count = 0;
             while(n  >  0){
                 count++;
                 n/=10;
             }
             if(count %2 ==0){
                 evendigits++;
             }
        }



    return evendigits;
    }
}
