package IntermediateQuestions;

import java.util.Scanner;
//import com.google.common.math.BigIntegerMath;
public class nCr {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n  = input.nextInt();
        int r  = input.nextInt();

        int n_fact = 1;
        for(int i  = 1 ; i<= n ; i++){
            n_fact = n_fact*i;
        }
        System.out.println("n_fact: "+n_fact);

        int r_fact = 1 ;
        for(int j = 1 ; j<= r ; j++){
            r_fact = r_fact*j;
        }
        System.out.println("r_fact: "+r_fact);

        int r_1_fact = 1;
        for(int j = 1 ; j<= n-r ; j++){
            r_1_fact = r_1_fact*j;
        }
        System.out.println(r_1_fact);

        System.out.println((n_fact)/(r_fact*r_1_fact));



    }
}
