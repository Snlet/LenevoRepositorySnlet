package QuestionsonFunctions;

import java.util.Scanner;

public class sumof_fisrt_n_natural_numbers {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n  =  input.nextInt();

        sum(n);
    }
    static void sum(int n){
        int sum = 0;

        while(n > 0 ){
            sum  = sum+n;
            n--;
        }
        System.out.println(sum);
    }
}
