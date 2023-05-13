public class searchinstrings {
    public static void main(String[] args) {
        System.out.println(search("sanket" , 'd'));
    }
    static boolean search(String s , char ch){
        System.out.println(s);
        System.out.println(s.toCharArray());

        if(s.length() == 0){
            return false;
        }

        for(char ch1 : s.toCharArray()) {
            if(ch  == ch1){
                return true;
            }
        }
//        for(int i  = 0 ; i <s.length() ; i++){
//            if(s.charAt(i) == ch){
//                return true;
//            }

        return false;

    }
}
