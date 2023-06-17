package Sorting_Assignment;

public class squareroot {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(findsquareroot(x));
    }

    public static int findsquareroot(int x){


        if(x == 0){
            return x;
        }

        int target=x;
        int start =1;
        int end = x;

        while(start <= end){

            int mid = start + (end - start)/2;
            if(x/mid == mid){
                return mid;
            }else if(x/mid < mid){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }
        return  end;





















//        int target = x;
//        int []ar = new int[target+1];
//
//        for(int i =0 ; i <=target ; i++){
//            ar[i] = i;
//        }
//
//        int start =0;
//        int end = ar.length;
//
//        while(start<=end){
//            int mid = start +(end-start)/2;
//
//            if(mid*mid < target){
//               start = mid+1;
//            }else if(mid*mid > target){
//                end = mid-1;
//            }else{
//                return mid;
//            }
//        }
//        return end;
    }
}
