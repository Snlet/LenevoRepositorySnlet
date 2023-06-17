package QuestionsonArray;

import java.util.Arrays;

public class reshapearray {
    public static void main(String[] args) {
        int [][]mat= {{1,2},{3,4}};
        System.out.println(Arrays.toString(matrixReshape(mat ,1,4)));

    }
    public static int[][] matrixReshape(int[][] mat,int r, int c) {
        int [][]newar = new int[r][c];


        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[i].length ; j++){
                if(r == 1&&i==0){
                    newar[0][j] = mat[i][j];
                }else if(r==1 && i ==1){
                    newar[0][j+i+1] = mat[i][j];
                }else{
                    newar[i][j] = mat[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(newar));


        return newar;
    }
}
