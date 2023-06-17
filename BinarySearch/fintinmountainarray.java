package BinarySearch;

public class fintinmountainarray {
    public static void main(String[] args) {

        int []ar = {1,2,3,4,5,3,1};
        int target = 3;
        int peak =findingpeakelement(ar,target);
        System.out.println(peak);


//        System.out.println(binarysearch(ar,target,0,peak));
//        System.out.println(binarysearch(ar,target,peak+1,ar.length-1));

        System.out.println(binarysearch(ar,target,0,peak) + binarysearch(ar,target,peak+1,ar.length-1));

    }

    public static int findingpeakelement(int []ar, int target){

        int start = 0 ;
        int end = ar.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(ar[mid] < ar[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }


        return start;
    }

    public static int binarysearch(int []ar  , int target,int s , int e){
//
        int start =s ;
        int end = e;

        while(start <= end){
            int mid= start + (end-start)/2;
            if(target < ar[mid]){
                end = mid-1;
            }else if(target > ar[mid]){
                start = mid+1;
            }else {
                return 1;
            }
        }
        return 0;
    }
}

