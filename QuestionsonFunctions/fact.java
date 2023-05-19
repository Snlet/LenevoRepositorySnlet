package QuestionsonFunctions;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int n = input.nextInt();

        givefact(n);

    }
    static void givefact(int n){
//        int fact = 1;

        if( n == 1 || n ==0){
            System.out.println("1");
        }else{
            int fact =1;
            while(n > 0){
                fact = fact * n;
                n -=1;
            }
            System.out.println(fact);

        }


    }
}
