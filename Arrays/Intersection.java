import java.util.*;
public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int num: nums1){
            s1.add(num);
        }
        for(int num: nums2){
            s2.add(num);
        }
        //intersection

        int[] res = new int[s1.size()];
        int k=0;

        for(int num: s1){
            if(s2.contains(num)){
                res[k] = num;
                k++;
            }
        }
        return Arrays.copyOfRange(res,0,k);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nums1[] = new int[m];
        int nums2[] = new int[n];
        
        for(int i=0; i<m; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            nums2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }
}
