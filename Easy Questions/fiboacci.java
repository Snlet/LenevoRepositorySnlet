package questions;

import java.util.Scanner;

public class fiboacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        fibonaci(number);
    }

    static void fibonaci(int n){
        int a = 1 ;
        int b =1 ;
        int temp = 0;

        if(n==1 || n==0){
            System.out.println(1);
        }else{
            for(int i = 2 ; i< n ; i++){
                temp = a;
                a = b;
                b = b+temp;
            }
            System.out.println(b);
        }



    }


}
