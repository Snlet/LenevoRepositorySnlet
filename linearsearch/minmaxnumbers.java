package linearsearch;

public class minmaxnumbers {
    public static void main(String[] args) {
        int arr[] = {23,543,547,5,5324,865,5524,57,655234,9812};

        max(arr);
        min(arr);
    }
    public static void max(int arr[]){
        int max = arr[0];
        if(arr.length == 0){
            System.out.println("empty");
        }

        for(int i = 0 ; i<arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max element is : "+max);
    }

    public static void min(int arr[]){
        int min = arr[0];
        if(arr.length == 0){
            System.out.println("empty");
        }
        for(int i = 0 ; i<arr.length ; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max element is : "+min);
    }


}
