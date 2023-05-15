package IntermediateQuestions;

import java.util.Scanner;

public class nPr {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();

        int n_fact =1;
        for(int i = 1 ; i <= n ; i++){
            n_fact = n_fact * i;
        }

        int n_r_fact = 1;
        for(int i = 1 ; i <= n - r  ; i++){
            n_r_fact = n_r_fact * i;
        }
        System.out.println(n_fact / n_r_fact);



    }
}
