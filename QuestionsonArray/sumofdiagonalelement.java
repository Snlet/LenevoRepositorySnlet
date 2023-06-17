package QuestionsonArray;

public class sumofdiagonalelement {

    public static void main(String[] args) {
        System.out.println("running this file");

        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));

    }
    public static int diagonalSum(int[][] mat) {
        int sum1=0;
        int l = mat.length;
        for(int i = 0 ; i <= Math.floorDiv(mat.length , 2) ; i++){

                sum1 = sum1 + mat[i][i] + mat[i][l - i - 1];

        }

//        int sum_final1 =sum1 - mat[Math.floorDiv(mat.length , 2)][Math.floorDiv(mat.length , 2)];

        int sum2 = 0;
        for(int i = mat[0].length-1 ; i > Math.floorDiv(mat.length , 2) ; i-- ){

                sum2 += mat[i][i] + mat[i][l - i -1];

//            sum2 += mat[i] + mat[l - i -1];
        }
        if(mat.length %2 == 0){
            return sum2+sum1;
        }else{
            int sum_final1 =sum1 - mat[Math.floorDiv(mat.length , 2)][Math.floorDiv(mat.length , 2)];
            return sum_final1+sum2;
        }

    }
}
