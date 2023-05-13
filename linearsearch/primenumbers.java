import java.awt.color.ICC_Profile;
import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter the number to check");
//        int n = input.nextInt();

//        System.out.println(check_prime(n));

        for(int i = 0 ; i<100 ; i++){
            if(check_prime(i) == 1){
                System.out.println(i);
            }
        }


    }

    public static int check_prime(int n) {
        int c = 0;
        int m = 2;
        boolean b = false;

        if (n == 1) {
            System.out.println("neither composite not prime");
        }

        while (m < n) {
            if (n % m == 0) {
                b = false;

                return 0;
            }
//           b =  true;
            m++;
        }

        return 1;


    }
}
