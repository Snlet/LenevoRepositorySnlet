package IntermediateQuestions;

import java.util.Scanner;

public class sumofnnumbers {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);

        int no = input.nextInt();

        int sum = 0;
        while(no > 0){

            int number  = input.nextInt();

            sum = number+sum;
            no--;
        }
        System.out.println(sum);
    }
}
