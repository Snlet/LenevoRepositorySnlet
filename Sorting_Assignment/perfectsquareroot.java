package Sorting_Assignment;
//5,681
public class perfectsquareroot {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare(5));
    }
    public static boolean isPerfectSquare(int num) {



        int start=1;
        int end = num;

        while(start<=end){
            int m = start+(end-start)/2;

            if (m * m==num) {
                return true;
            }else if (m > num/m){
                end = m-1;
            }else {
                start = m+1;
            }
        }
        return false;
    }
}
