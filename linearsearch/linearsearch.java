public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {325,32,23,654,324,6,546245,5465,234,23,745};
        int []a = {};
        int target = 745;
        System.out.println(find(arr , target));
//        System.out.println(find(a , target));


    }

    public static int find(int []arr , int target){
        if(arr.length == 0){
            return  Integer.MAX_VALUE;
        }
        for(int i = 0 ; i<arr.length  ;i++){
            if(arr[i] == target){
                return arr[i];
            }
        }


        return 0;
    }
}
