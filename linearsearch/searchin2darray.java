package linearsearch;

public class searchin2darray {
    public static void main(String[] args) {
        int target  = 7;
        int [][]arr = {{1,2,100},{4,5},{6,7,8}};
//         search(arr , target);
        maxele(arr);
    }

    public static void maxele(int [][]arr){
        int max=arr[0][0];

        for(int i = 0 ; i< arr.length ; i++){
            for(int j =0;j<arr[i].length ; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static void search(int[][] arr,int target){

        for(int  i=0 ; i<arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}
