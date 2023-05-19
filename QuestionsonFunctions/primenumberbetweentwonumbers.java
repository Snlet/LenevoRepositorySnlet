package QuestionsonFunctions;

import java.util.Scanner;

public class primenumberbetweentwonumbers {
    public static void main(String[] args) {

Scanner input =  new Scanner(System.in);
int a = input.nextInt();
int b =  input.nextInt();
printptimenumebrs(a,b);
    }
    static void printptimenumebrs(int a,int b){
        for( int i = a ; i <= b ; i++){
            if(i%2 == 0 || i%3 ==0 || i%5 ==0){

            }else{
                System.out.println(i);
            }
        }
    }


}
