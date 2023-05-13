public class findingmax {
    public static void main(String[] args) {
        int []arr = {12,23,45,6,53,65,37};
        max(arr);
    }
    public static void max(int []arr){
        int max =  arr[0];

        for(int  i =1 ; i<arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(",maximum element is: "+ max);
    }
}
