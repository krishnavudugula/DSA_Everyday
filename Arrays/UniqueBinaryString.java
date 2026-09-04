// You're given n binary strings, and each string has length n.
// You need to return any binary string of length n that is NOT already in the array.

public class UniqueBinaryString {
    public static String uniqueBinaryString(String[] nums){
        StringBuilder s = new StringBuilder();
        for(int i=0; i<nums.length; i++){
            if(nums[i].charAt(i) == '0'){
                s.append('1');
            } else {
                s.append('0');
            }
        }
        return s.toString();

    }
}

