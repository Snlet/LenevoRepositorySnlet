package QuestionsonArray;

import java.util.HashSet;
import java.util.Set;

public class pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
//        char []ch = new char[sentence.length()];\
        Set<Character> list = new HashSet<>();


        char []ch = sentence.toCharArray();

        for(char ele:ch){
            list.add(ele);
        }

        if(list.size() == 26){
        return true;}
        else{
            return false;
        }

    }
}
