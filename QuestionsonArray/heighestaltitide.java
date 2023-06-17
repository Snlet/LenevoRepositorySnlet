package QuestionsonArray;

public class heighestaltitide {
    public static void main(String[] args) {

        int []gain = {-5,1,5,0,-7};

        System.out.println(largestAltitude(gain));

    }
    public static int largestAltitude(int[] gain) {
        int calar[] = new int [gain.length +1];
        int altitude[] = new int[calar.length];

        calar[0]  = 0;

        for(int i = 0 ; i < gain.length ; i++){
            calar[i+1] = gain[i];
        }
            int c = 0;
        for(int i = 0 ; i < calar.length ; i++){
            int sum =0 ;

            for(int j = 0 ; j <= i ; j++){
                sum = sum+calar[j];
            }
            altitude[c] = sum;
            c++;

        }
        int max = altitude[0];
        for(int ele:altitude){
            if(max < ele){
                max = ele;
            }

        }
        return max;
    }
}
