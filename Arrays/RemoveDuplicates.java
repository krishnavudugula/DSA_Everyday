import java.util.*;

public class RemoveDuplicates {

    public static int removeDuplicate(int[] nums) {

        // 1,1,1,2,2,3,4,4,5,6
        // 1,2,3,4,5,6

        int k = 1;

        for(int j = 1; j < nums.length; j++) {

            if(nums[j] != nums[j - 1]) {
                nums[k] = nums[j];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];

        // input
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicate(nums);

        // output
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}