package QuestionsonArray;

public class transposeofmatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,1,1} , {2,2,2} , {3,3,3},{4,4,4}};

        transpose(matrix);


    }
    public static void transpose(int[][] matrix) {



        int[][] newarray = new int [matrix[0].length][matrix.length];

        for(int i =0 ; i < matrix.length ; i++){
            for(int j = 0 ; j <matrix[i].length ; j++){
//                System.out.print(" "+matrix[i][j]);

                newarray[j][i] = matrix[i][j];
            }
        }
       for(int[] ele:newarray){
           for(int ele1 :ele){
               System.out.print(" "+ele1);
               }
           System.out.println();
       }
    }
}
