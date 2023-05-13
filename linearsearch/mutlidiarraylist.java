import java.util.ArrayList;
import java.util.Scanner;

public class mutlidiarraylist {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0 ;i<3 ; i++){
            list.add(new ArrayList<>());
        }

        for(int j = 0 ; j < 4 ; j++){
            for(int i = 0 ; i<3 ; i++){
                list.get(i).add(input.nextInt());
            }
        }
    }
}
