import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 0, b =1; //F(n) = F(n-1) + F(n-2)

        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
    }
}
