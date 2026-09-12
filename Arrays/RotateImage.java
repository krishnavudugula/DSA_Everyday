//48. RotateImage
import java.util.*;
public class RotateImage {
    public static int[][] rotate(int[][] matrix){
        int n = matrix.length;

        //Matrix Tranpose
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }        
        //Array reverse (each row)
        for(int i=0; i<n; i++){
            int left = 0;
            int right = n - 1;

            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] matrix = new int[x][y];

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] result = rotate(matrix);
        for (int[] row : result){
            System.out.println(Arrays.toString(row));
        }
    }
}