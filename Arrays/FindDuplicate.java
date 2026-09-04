//287- Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive. 
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and using only constant extra space.

import java.util.*;
public class FindDuplicate {
    public static int findDuplicate(int[] nums){
       Set<Integer> set = new HashSet<>();
       for(int num: nums){
        if(set.contains(num)){
            return num;
        }
        set.add(num);
       }
       return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int result = findDuplicate(nums);
        System.out.println(result);
    }
}
