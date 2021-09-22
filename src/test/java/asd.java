import java.util.HashMap;
import java.util.Map;
import java.util.function.IntConsumer;

public class asd{
    public static int[][] rotateMatrix(int[][] mat, int n) {
        int[][] result = new int[n][n];
        for(int i = n - 1;i >= 0; i--) {
            for(int j = 0;j <= n-1;j++) {
                result[j][n - 1 - i] = mat[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] res = rotateMatrix(mat, 3);
//        System.out.println();
//        for(int i = 0;i <= 3 - 1; i++) {
//            for(int j = 0;j <= 3 - 1;j++) {
//                System.out.print(res[i][j] + ",");
//            }
//            System.out.println();
//        }
        System.out.println(minPathSum(mat));
    }


    public static int minPathSum(int[][] matrix){

        int[][] result = new int[matrix.length][matrix[0].length];

        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[i].length;j++){
                if(i==0 && j==0)
                    result[i][j] = matrix[i][j];
                else if(i==0&&j>0){
                    result[i][j] = result[i][j-1] + matrix[i][j];
                } else if(j==0) {
                    result[i][j] = result[i-1][j] + matrix[i][j];
                } else {
                    int right = result[i-1][j] + matrix[i][j];
                    int down = result[i][j-1] + matrix[i][j];
                    result[i][j] = Math.min(right, down);
                }
            }
        }



        return result[matrix.length-1][matrix[0].length-1];
    }
}