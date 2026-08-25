import java.util.*;

class Main {

    public static void rotate(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int left, int right) {

        while (left < right) {
            //left = 0; right = n-1;
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }



    //Predefined

    //  public static void main(String[] args) {

    //     // INITIALIZE nums
    //     int[] nums = {1, 2, 3, 4, 5, 6, 7};

    //     // INITIALIZE k
    //     int k = 3;

    //     // CALL rotate()
    //     rotate(nums, k);

    //     // Print result
    //     for (int i = 0; i < nums.length; i++) {
    //         System.out.print(nums[i] + " ");
    //     }
    // }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array size
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Take array values
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Take k
        int k = sc.nextInt();

        // Rotate
        rotate(nums, k);

        // Print result
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
