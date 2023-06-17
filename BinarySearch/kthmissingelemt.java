package BinarySearch;

public class kthmissingelemt {
    public static void main(String[] args) {

        int []ar = {2,3,4,7,11};

//        1,2,3,4
//        2,3,4,7,11
        int k = 2;
        findKthPositive(ar,k);
    }
    public static int findKthPositive(int[] ar, int k) {
        int nar[] = new int[ar[ar.length] + k];

        for(int i = 0 ; i < nar.length-1 ;i++){
            nar[i] = i;
        }

        int i =0;
        int j =0;

        while(k !=0){
            if(ar[i]!=nar[j]){
                j++;
                k--;
            }else{
                i++;
                j++;

            }
        }
        return nar[j];

    }
}
