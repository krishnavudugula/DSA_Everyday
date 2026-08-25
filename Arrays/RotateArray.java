public class RotateArray {
    public void rotate(int nums[], int k){
        k = k % nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length -1);
    }
    public void reverse(int[] nums, int left, int right){
        //left = 0; right = n-1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;      
                  
        }
    }
}
