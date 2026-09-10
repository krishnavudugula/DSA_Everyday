import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] answer = new int[digits.length + 1];
        answer[0] = 1;

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        System.out.println("Enter the digits:");

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        int[] answer = plusOne(digits);

        System.out.println("After adding 1: " + Arrays.toString(answer));
    }
}

