public class searchinrange {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,67,8,9,0,100};
        int f= 2;
        int l =7;
        int target = 5;
        System.out.println(search(arr , f,  l ,target));
    }

    public static boolean search(int []arr ,int f, int l ,int target){

        if(arr.length == 0){
            return false;
        }
        for (int i =f ; f< l  ; i++){
            if(arr[i] == target){
                return true;
            }
        }return false;



    }
}
