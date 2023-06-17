package BinarySearch;

public class mountainarray {
    public static void main(String[] args) {
        int []ar = {1,2,3,4,5,6,4,3,2,1};
        System.out.println(mountainarray(ar));
    }
    public static int mountainarray(int []ar){
        int max =-1;
        int start = 0;
        int end = ar.length-1;

        while(start != end){
            int mid = start + (end-start)/2;
            if(ar[mid]> ar[mid+1]){
                end = mid;
            }else if(ar[mid] < ar[mid+1]){
                start = mid+1;
            }
        }
        return ar[start];
    }

}
