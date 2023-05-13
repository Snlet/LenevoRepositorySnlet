package linearsearch;

import org.w3c.dom.ls.LSOutput;


//short cut to find the no.of digigts
/*
* fucntion(nums)
* { return (int)(Math.log10(num))+1;}
*
*
* */

public class evenoddelementbykunalkushwaha {
    public static void main(String[] args) {
int []nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

        System.out.println(digits(0));
    }




    static int findNumbers(int []nums){
        int count = 0;
    for(int num:nums){
        if(even(num)){
            count++;
        }
    }
    return count;
    }
//        tells if the number is even or odd;
    static boolean even(int nums){
        int n = digits(nums);
      /*  if(n%2 == 0){
            //even
            return true;
        }return false;
*/
        return n%2 == 0;

    }

//    count the digit of numbers
    static int digits(int num){
        if(num == 0){
            return  1;
        }
    int count  = 0;
    if(num > 0){
        while(num >0){
            count++;
            num /=10;}
    }

    if(num<0){
        while(num <0){
            count++;
            num /=10;}
    }
    return count;
    }
}
