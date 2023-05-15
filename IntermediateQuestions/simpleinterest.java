package IntermediateQuestions;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);

        int principle = input.nextInt();
        double r = input.nextDouble();
        int t = input.nextInt();

        double simple_interest = Math.pow((principle + r/100),t);
        System.out.println(simple_interest);

    }
}
