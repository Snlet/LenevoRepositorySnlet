import java.util.Scanner;
import java.util.*;

public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

//        System.out.println("eneetr the l: ");
//        int l = input.nextInt();
//
//        System.out.println("eneetr the h: ");
//        int h = input.nextInt();

        int s = input.nextInt();
        tsacube(s);




//        areacircle(r);
//        areacircle(l , h);
    }

    static void tsacube(int s){
        System.out.println(6*s*s);
    }
    static void areacircle(int l , int h){
        System.out.println(0.5*l*h);
    }
}
