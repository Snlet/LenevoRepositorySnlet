package QuestionsonFunctions;

import java.util.Scanner;

public class pythogorustripletornot {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int r = pythogorus(a, b, c);

        if(r == 1){
            System.out.println("is a tripplet");
        }else{
            System.out.println("not a tripplet");
        }
    }
    static int pythogorus(int a , int b , int c){

        if(Math.pow(a, 2) == Math.pow(b,2)+Math.pow(c ,2)){
            return 1;
        }
        if(Math.pow(b, 2) == Math.pow(a,2)+Math.pow(c ,2)){
            return 1;
        }
        if(Math.pow(c, 2) == Math.pow(b,2)+Math.pow(a ,2)){
            return 1;
        }
    return 0;
    }
}
