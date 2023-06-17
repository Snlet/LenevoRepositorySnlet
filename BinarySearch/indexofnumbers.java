package BinarySearch;

import java.util.Arrays;

public class indexofnumbers {
    public static void main(String[] args) {
        int []ar = {1,2,2,7,7,8,8,10};
        int target = 2;

        System.out.println(Arrays.toString(element(ar,target)));
    }
    public static int[] element(int []ar , int target){
        int []ans = {-1,-1};
        ans[0] = search(ar,target , true);
        System.out.println(ans[0]);
        ans[1] = search(ar,target , false);

        return ans;
    }

    public static int search(int []ar , int target , boolean isfirstindex){
        int ans=-1;
        int start = 0;
        int end = ar.length-1;

        while(start <=end){
            int mid = start + (end-start)/2;
            if(target > ar[mid]){
                start = mid+1;
            }else if(target < ar[mid]){
                end = mid-1;
            }else{
                ans = mid;

                if(isfirstindex){
                    end  = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
