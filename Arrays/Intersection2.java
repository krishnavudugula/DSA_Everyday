
package Arrays;
// import java.util.HashMap;
// import java.util.ArrayList;
// import java.util.List;
import java.util.*;

public class Intersection2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies of each number in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> resultList = new ArrayList<>();
        
        // Check numbers in nums2 against the hash map
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                // Decrease frequency count to handle duplicates correctly
                map.put(num, map.get(num) - 1);
            }
        }
        
        // Convert the dynamic list back to a primitive int array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}