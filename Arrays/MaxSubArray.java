import java.util.*;
public class MaxSubArray {
    //53. Max Subarray
    public static int maxSubArray(int[] nums) {
        // int maxSum = nums[0];
        // int currentSum = nums[0];

        // for (int i = 1; i < nums.length; i++) {
        //     currentSum = Math.max(nums[i], currentSum + nums[i]);
        //     maxSum = Math.max(maxSum, currentSum);
        // }

        // return maxSum;

          int n = nums.length;

        for(int i=1; i<n; i++){
            nums[i] = Math.max(nums[i], nums[i] + nums[i-1]);
        }

        int max = nums[0];

        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int[] nums = new int[m];

        for(int i=0; i<m; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(maxSubArray(nums));
    }
}
