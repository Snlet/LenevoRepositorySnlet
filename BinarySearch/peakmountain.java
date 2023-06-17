package BinarySearch;

public class peakmountain {
    public static void main(String[] args) {
        int ar[] = {10,2,1,0};
        System.out.println(peakIndexInMountainArray(ar));

    }

    public static int peakIndexInMountainArray(int[] ar) {
        int start =0;
        int end = ar.length-1;
        int ans = -1;

        while(start < end){
            int mid= start + (end-start)/2;

            if(ar[mid] > ar[mid+1] && ar[mid]>ar[mid-1]){
                ans = mid;
                return ans;
            }else if(ar[mid]  <ar[mid+1] && mid < end){
                start = mid+1;
            }else if(ar[mid] < ar[mid-1] && mid >start ){
                end = mid-1;
//
            }
        }
        return ans;
    }
}
