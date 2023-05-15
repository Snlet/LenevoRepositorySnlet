package IntermediateQuestions;

import java.util.Scanner;
import java.math.*;

public class armstrongnumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

       int  n_og = n;
       int sum = 0;

        while(n > 0){
            int rem = n %10;
            sum = (int) (sum + Math.pow(rem ,3));
            n/=10;
        }

        if(sum == n_og){
            System.out.println(1);
        }else {
            System.out.println(0);
        }


    }
}
