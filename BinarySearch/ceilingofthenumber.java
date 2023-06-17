package BinarySearch;

public class ceilingofthenumber {
    public static void main(String[] args) {
        int [] ar = {2,3,5,9,14,16,18,20};
        int target  = 21;

        int [] ar1 = {2,4,8,9,16,17};
        int target1  = 7;

        System.out.println(ceilingofnumber(ar1 , target1));
    }
    public static int ceilingofnumber(int[] ar , int target) {
        int ele = 0;
        int start = 0;
        int end = ar.length - 1;
        int mid = start + ((end - start) / 2);
        if (ar[ar.length - 1] < target) {
            return -1;
        } else {
            while (start <= end) {
                mid = (start + end) / 2;
                System.out.println("mid is" + ar[mid]);

                if (target > ar[mid]) {
                    start = mid + 1;
                } else if (target < ar[mid]) {
                    end = mid - 1;
                } else {
                    System.out.println("answer found");
                }

            }
            return ar[start];
        }
    }
}
