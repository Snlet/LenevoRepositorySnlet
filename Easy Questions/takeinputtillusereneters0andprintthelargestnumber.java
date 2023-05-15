package questions;

import java.util.Scanner;

public class takeinputtillusereneters0andprintthelargestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n == 0){
            System.out.println("Code is exited");
        }else{
            int number= n ;
            int max  = n;
            while(number!= 0){
                if(max < number){
                    max = number;
                }
                number = input.nextInt();
            }
            System.out.println("max number is : "+ max);
        }


    }
}
