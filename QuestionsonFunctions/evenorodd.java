package QuestionsonFunctions;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a= input.nextInt();

        evenodd(a);

    }
    static void evenodd(int a){

        if(a %2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println("odd number");
        }

    }
}
