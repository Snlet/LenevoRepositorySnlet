import java.util.Arrays;

public class reversinganarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        reverse(arr);
    }

    public static void reverse(int arr[]){

        int temp;
        int mid = Math.floorDiv(arr.length,2);

        for(int i = 0; i< mid; i++){

                                                            //arr.lenght = 5;
            temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;



        }
        System.out.println(Arrays.toString(arr));





    }
}
