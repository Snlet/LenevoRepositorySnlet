public class minmaxmethod {
    public static void main(String[] args) {
        int[]a={12,14,16,90,23};
        int max = a[0];
        for(int i = 0 ; i < a.length ; i++){
            max = Math.max(max , a[i]);
        }
        System.out.println(max);
    }
}
