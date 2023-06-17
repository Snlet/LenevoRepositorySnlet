package QuestionsonArray;

import java.util.ArrayList;
import java.util.List;

public class luckynumberinmatrix {
    public static void main(String[] args) {
        int[][] ar = {{3, 7, 8}, {15, 16, 17}, {9, 11, 13}};

        System.out.println(luckyNumbers(ar));

    }

    //    List<Integer
    public static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<Integer>();
        for (int i=0;i< matrix.length;i++) {
            int m=Integer.MAX_VALUE,mi=0;
            for (int j=0;j<matrix[i].length;j++) {
                if (matrix[i][j]<m) {
                    m=matrix[i][j];
                    mi=j;
                }
            }
            int flag=0;
            for (int k=0;k< matrix.length;k++) {
                if (matrix[k][mi]>matrix[i][mi]) {
                    flag=1;
                    break;
                }
            }
            if (flag==0) {
                ans.add(matrix[i][mi]);
            }
        }
        return ans;
    }


    }



