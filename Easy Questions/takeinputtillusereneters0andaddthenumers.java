package questions;

import java.util.Scanner;

public class takeinputtillusereneters0andaddthenumers {
    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        int n  = input.nextInt();


        if( n == 0){
            System.out.println("code exited");
        }else{
            int sum = 0;
            int number = n;

            while( number != 0){
                sum = sum+number;
                 number = input.nextInt();
            }
            System.out.println("code exited and value of sum is: "+ sum);
        }


    }
}
