package QuestionsonArray;

import java.util.Arrays;
import java.util.HashSet;

public class matrixrotation {
    public static void main(String[] args) {
//

        int[][] mat = {{0,1} , {1,0}};
        int[][] target = {{1,0} , {1 ,1}};

        System.out.println(findRotation(mat , target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        System.out.println("inside function");
        HashSet<Integer> set_mat = new HashSet<>();
        HashSet<Integer> set_target = new HashSet<>();


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                set_mat.add(mat[i][j]);
                set_target.add(target[i][j]);
            }
        }
        System.out.println(set_mat);
        System.out.println(set_target);

        if (set_mat.equals(set_target)) {
            int[][] newmatrix = new int[mat.length][mat[0].length];
            int l = mat.length;

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {

                    newmatrix[j][l - i - 1] = mat[i][j];
//                    System.out.print(" "+mat[i][j]+"mat");

                    System.out.println();
//                    System.out.print(" "+newmatrix[j][l-i-1]+"newmat");

                }
            }


            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(newmatrix[i][j]);
                    ;
                }
                System.out.println();
            }
            boolean b = false;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (newmatrix[i][j] != target[i][j]) {
                        b = false;
                    }else{
                        b = true;
                    }
                }

            }
            return b;
        } else {
            return false;
        }

//        return false;
    }
}
