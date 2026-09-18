import java.util.*;
//42. Trapping Rain Water.
public class TrappingRain {
    public static int trap(int[] height){
        int n = height.length;
        int[] LSA = new int[n];
        int[] RSA = new int[n];
        int sum = 0;
        LSA[0] = height[0];
        RSA[n-1] = height[n-1];

        for(int i=1; i<n; i++){
            if(LSA[i-1] > height[i]){
                LSA[i] = LSA[i-1];
            }
            else {
                LSA[i] = height[i];
            }
        }
        for(int i=n-2; i>=0; i--){
            if(RSA[i+1] > height[i]) {
                RSA[i] = RSA[i+1];
            }
            else {
                RSA[i] = height[i];
            }
        }
        for(int i=0; i<n; i++){
            sum += Math.min(LSA[i], RSA[i]) - height[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] height = new int[m];
        for(int i=0; i<m; i++){
            height[i] = sc.nextInt();
        }
        int result = trap(height);
        System.out.println(result);
    }
}
