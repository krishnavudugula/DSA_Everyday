import java.util.*;

// 1089. Duplicate Zeroes
public class DuplicateZeroes {

    public static int[] duplicateZeros(int[] arr) {

        int possibleDups = 0;
        int last = arr.length - 1;

        // Find how many zeros can actually be duplicated
        for (int i = 0; i <= last - possibleDups; i++) {

            if (arr[i] == 0) {

                if (i == last - possibleDups) {
                    arr[last] = 0;
                    last--;
                    break;
                }

                possibleDups++;
            }
        }

        // Move elements from right to left
        for (int i = last - possibleDups; i >= 0; i--) {

            if (arr[i] == 0) {

                arr[i + possibleDups] = 0;

                possibleDups--;

                arr[i + possibleDups] = 0;

            } else {

                arr[i + possibleDups] = arr[i];
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = duplicateZeros(arr);

        System.out.println(Arrays.toString(result));
    }
}