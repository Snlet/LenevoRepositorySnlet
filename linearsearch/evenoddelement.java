package linearsearch;

import java.util.Arrays;

public class evenoddelement {
    public static void main(String[] args) {
        int[] arr = {23, 3, 77, 2378, 904, 34,1000};
        check(arr);
    }

    public static void check(int[] arr) {
        int times = 0;
        for (int i = 0; i < arr.length; i++) {
            times = times+evenodd(arr[i], i);
        }
        System.out.println(times);

    }

    public static int evenodd(int n, int index) {

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        if (count % 2 == 0) {
            return 1;
        }
    return 0;
    }
}
