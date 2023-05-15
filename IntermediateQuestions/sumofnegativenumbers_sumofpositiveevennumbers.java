package IntermediateQuestions;

import java.util.Scanner;

public class sumofnegativenumbers_sumofpositiveevennumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(n == 0){
            System.out.println("code exited");
        }else {
            int sum = n;
//            int num = 1;
            while( true){
                int num = input.nextInt();
                if(num == 0){
                    break;
                }else {
                    sum = sum + num;
                }

            }
            System.out.println("sum is: "+sum);
        }

    }
}
