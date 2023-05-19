package QuestionsonFunctions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palindromeornot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n =  input.nextInt();
        checkpalindrome(n);
    }

    static void checkpalindrome(int n){

        if(n > 0 && n < 10){
            System.out.println("it is a palindrome");
        }else{

            int n_og = n;
            int rem = 0;
            while(n  > 0 ){

//                rem = n %10;
                rem = rem*10 + n%10;
                n/=10;

            }
            if(rem == n_og){
                System.out.println("palindrome number: ");
            }else{
                System.out.println("nota apalindrome");
            }

        }

    }
}
