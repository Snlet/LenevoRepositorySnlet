package QuestionsonArray;

import java.util.Arrays;

public class arrayformofinterger {
    public static void main(String[] args) {
        int[]num = {1,2,3,4,5,0,0};
        int k = 67;
        addToArrayForm(num , k);
    }
    public static void addToArrayForm(int[] num, int k) {
        int pointer = 0;
        int n = k;

        for(int i = 0 ; i  < num.length ; i++){
            if(num[i] == 0){
                pointer = i;
                break;
            }
        }
        while( n > 0){
            if(n <=9 && n >=0){
//                n = n%10;
                num[pointer] = n;
                n=n/10;
            }else{
                int n1 = n/10;
                num[pointer] = n1;
                pointer++;
            }
            n = n%10;
        }
        System.out.println(Arrays.toString(num));
        for(int ele:num){
            System.out.print(ele);
        }
    }
}
