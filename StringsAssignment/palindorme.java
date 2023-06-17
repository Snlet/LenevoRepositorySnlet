package StringsAssignment;

import java.util.Arrays;

public class palindorme {
    public static void main(String[] args) {
        String str= "abcdcba";

        System.out.println(check(str));
    }
    public static boolean check(String s){

        for(int i=0;i < Math.floorDiv(s.length() ,2) ;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
//        System.out.println(s.charAt(0));
        return true;
    }
}
