package questions;

public class isitpalindrome {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(str.length());
        boolean ispalindome = false;

        int mid = Math.floorDiv(str.length() , 2);

        for(int i = 0  ; i < mid ; i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                ispalindome  = true;
            }else{
                ispalindome  = false;
            }
        }

        if(ispalindome){
            System.out.println("is palindrome: ");
        }else{
            System.out.println("not a palindrome: ");
        }

    }

}
