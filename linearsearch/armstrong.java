public class armstrong {
    public static void main(String[] args) {
        int n = 151;


        arm(n);
    }
    public static void arm(int n){
        int num  =0;
        int rem;
        int og_n = n;
        while(n>0){

            rem = n % 10;
            n=n/10;
            num= num + rem*rem*rem;

        }

        if(num == og_n){
            System.out.println("number is armstrong number: ");
        }else{
            System.out.println("not a armstrong number: ");
        }
    }
}
