package BinarySearch;

public class celiingincaseofcharecters {
    public static void main(String[] args) {
    char []letters = {'c','f','j'};
    char target ='c';

        System.out.println(nextGreatestLetter(letters , target));

    }
    public static char nextGreatestLetter(char[] letters, char target){

        int s = 0 ;
        int e = letters.length-1;
        int ele = 'z';
        while(s<e){
            int m = s+(e-s)/2;

            if(letters[m]<target){
                s =m+1;
            }else if(letters[m]>target){
                e = m-1;
                ele = m;
            }
        }
        return letters[ele];

    }

}
