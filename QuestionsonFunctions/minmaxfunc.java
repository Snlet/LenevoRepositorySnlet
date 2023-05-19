package QuestionsonFunctions;

import java.util.Scanner;

public class minmaxfunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        min(a,b,c);
        max(a,b,c);
    }
    static void min(int a, int b , int c){
        int max = Math.max(a, Math.max(b,c));
        System.out.println(max);
    }

    static void max(int a, int b , int c){
        int min = Math.min(a , Math.min(b,c));
        System.out.println(min);
    }


}
