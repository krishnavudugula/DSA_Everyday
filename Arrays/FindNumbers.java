import java.util.*;
//1295. Given an integer array, count how many numbers contain an even number of digits.
class Solution {
    public static int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            int digits = 0;
            int temp = num;

            while (temp != 0) {
                temp = temp / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int result = findNumbers(nums);

        System.out.println(result);
    }
}