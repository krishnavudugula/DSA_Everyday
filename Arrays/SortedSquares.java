import java.util.*;
//977. Squares of a sorted Array (could be negative numbers too)
public class SortedSquares {
    public static int[] sortedSquares(int[] nums){
        int n = nums.length;

        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
        }

        return result;
    }

//     class Solution {
//     public int[] sortedSquares(int[] nums) {

//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = nums[i] * nums[i];
//         }

//         Arrays.sort(nums);

//         return nums;
//     }
// }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}
