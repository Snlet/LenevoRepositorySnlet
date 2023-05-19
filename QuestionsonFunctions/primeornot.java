package QuestionsonFunctions;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a  = input.nextInt();
        primenot(a);
    }
    static void primenot(int n){

        int n_og =n;

        for(int i = 2 ; i< n_og ; i++){
            if(n_og %i == 0){
                System.out.println("not a prime number: ");
                break;
            }else{
                System.out.println("is a prime number: ");
                break;
            }
        }


    }
}
