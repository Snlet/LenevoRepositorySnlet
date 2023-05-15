package IntermediateQuestions;

import java.util.Scanner;

public class findingdepreicicationvalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("in put the value of asset: ");
        int asset = input.nextInt();

        System.out.println("Enter the salvage value: ");
        int sal  = input.nextInt();

        System.out.println("Enter the number of years ");
        int year_left = input.nextInt();

        System.out.println((asset * sal)/year_left);
    }
}
