package questions;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int b = input.nextInt();

        int num = input.nextInt();

        arm(a, b, num);
    }

    static void arm(int a ,int b , int n){
        int rem;
        int num = 0;
        for(int i = a ; i< b ; i++){

               while(i < b){
                   rem = i%10;

                   num = num+rem*rem*rem;

                   i = i/10;


               }
        }
//        if(n == )


    }
}
