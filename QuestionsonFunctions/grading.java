package QuestionsonFunctions;

import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if(a<=100 & a > 90){
            System.out.println("AA");
        }

        if(a<=90 & a > 80){
            System.out.println("AB");
        }

        if(a<=80 & a > 70){
            System.out.println("BB");
        }

        if(a<=70 & a > 60){
            System.out.println("BC");
        }

        if(a<=60 & a > 50){
            System.out.println("CC");
        }else if (a <= 50){
            System.out.println("FAIL");
        }



    }
}
