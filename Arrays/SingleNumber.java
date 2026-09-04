import java.util.*;
public class SingleNumber {
    public static int singleNumber(int[] nums){
        int result = 0;

        for(int num: nums){
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        //input
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
       System.out.println(singleNumber(nums));
    }
}
