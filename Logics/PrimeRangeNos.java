import java.util.Scanner;

public class PrimeRangeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            if (num <= 1) {
                continue;
            }

            boolean isPrime = true;
            int i = 2;

            while (i * i <= num) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
        
        sc.close();
    }
}