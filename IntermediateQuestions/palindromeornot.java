package IntermediateQuestions;

import java.util.Scanner;

public class palindromeornot {
    public static void main(String[] args) {
        int n = 123321;
        int n_og = n ;

        int no=0;
        int rem =0 ;
        while(n>0){
            rem = n%10 ;
            no = no*10+rem ;
             n/=10;
        }
        System.out.println(no);

        if(n_og  == no/10){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }



    }
}
