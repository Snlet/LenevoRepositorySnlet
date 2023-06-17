package Sorting_Assignment;

public class LeetCode368 {
    public static void main(String[] args) {
        int ar[] = {2,1,3,0};
        System.out.println(findingmissingelement(ar));
    }

    public static int findingmissingelement(int []ar){
        int no=ar.length;

        int i=0;

        while(i <ar.length) {
            int correct = ar[i];
            if (ar[i] == ar.length) {
                i++;
            } else if (ar[i] != ar[correct]) {
                swap(ar, i, correct);
            } else {
                i++;
            }
        }

        int j =0;
        while(j < ar.length){
            if(ar[j] !=j){
                no = j;
                return j;
            }
            j++;
        }
        return no;
    }

    public static void swap(int[] ar,int i , int correct){
        int temp = ar[i];
         ar[i] = ar[correct];
        ar[correct] = temp;
    }
}
