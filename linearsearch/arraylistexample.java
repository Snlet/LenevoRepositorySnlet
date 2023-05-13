import java.lang.reflect.Array;
import java.util.ArrayList;

public class arraylistexample {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<Integer>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        System.out.println(list);
//
//        System.out.println(list.contains(330));
//
//        list.set(0,99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        for(int i = 0 ; i<5 ;i++ ){
            list.add(i);
        }

        for(int j = 0 ; j < 5 ; j++ ){
            list.get(j);
        }
        System.out.println(list);

         
    }
}
