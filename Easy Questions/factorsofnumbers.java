package questions;

import java.util.Scanner;

public class factorsofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i  = number; i > 0 ; i--){

            if(number % i  == 0){
                System.out.print(" "+i);
            }


        }


    }
}
