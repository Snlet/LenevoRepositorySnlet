package BinarySearch;

public class orderagnosticbinarysearch {
    public static void main(String[] args) {
        int []a = {90,89,78,67,45,34,23,12,10};
        int target = 23;

        boolean isAsc;

        int s = 0;
        int e = a.length-1;

        if(a[s] < a[e]){
            isAsc = true;
        }else{
            isAsc = false;
        }

        if(isAsc){
            while(s <= e){
                int mid = s + (e-s)/2;
                if(target < mid){
                    e = mid -1;
                }else{
                    s = mid+1;
                }
            }
            System.out.println("eleemnt found");

        }else{
            while(s <= e){
                int mid = s + (e-s)/2;
                if(target > mid){
                    e = mid -1;
                }else{
                    s = mid+1;
                }
            }
            System.out.println("element is found in descending order: ");
        }



    }
}
