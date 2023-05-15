package BinarySearch;

public class codingthebinarysearch {
    public static void main(String[] args) {

        int a[] = {12,23,34,45,56,67,78,89,90,100};
        int target = 101 ;

        System.out.println(binarysearch(a , target));


    }

    static int binarysearch(int []a , int target){

        int start = 0;
        int end  = a.length-1;

        while(start <=end ){

            int mid = start +(end-start)/2;

            if(target < a[mid]){
                end = mid-1 ;
            }else if(target > a[mid]){
                start = mid+1;
            }else{
                return 1;
            }
        }
        return -1;
    }
}
