import java.util.Scanner;

public class diffbetweensumandproduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        System.out.println(subtractProductAndSum(n));
    }
    public static  int subtractProductAndSum(int n) {
        int og_n = n;
        int pr =1;
        while(n >0){
            int rem;
            rem = n%10;
            pr = pr*rem;
            n /=10;
        }
        System.out.println("pr is: "+pr);

        int sm =0;
        while(og_n >0){
            int rem;
            rem = og_n%10;
            sm = sm+rem;
            og_n /=10;
        }
        System.out.println("sm is: "+sm);
        return pr -sm;
    }
}
