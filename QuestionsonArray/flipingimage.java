package QuestionsonArray;

public class flipingimage {
    public static void main(String[] args) {

        int[][] image = {{1,1,0,0} , {1,0,0,1} , {0,1,1,1} , {1,0,1,0}};
        int [][] image1 = flipAndInvertImage(image);
        for(int[] ele:image){
            for(int ele1:ele){
                System.out.print(" " +ele1);
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int l = image[0].length;
       for(int i = 0 ; i < image.length ; i++){
           for(int j = 0  ; j < Math.floorDiv(image[i].length,2) ; j++){
//               System.out.println(Math.floorDiv(image[i].length,2));

               int temp =image[i][j];
               image[i][j] = image[i][l-1-j];
               image[i][l-1-j] = temp;
           }
           for(int j = 0 ; j  < image[i].length ;j++){
               if(image[i][j] == 1){
                   image[i][j] -=1 ;
               }else{
                   image[i][j] +=1;
               }
           }

       }
    return image;

    }
}

