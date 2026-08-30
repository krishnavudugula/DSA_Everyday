import java.util.*;
public class RemovingFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //digits counting using string conversion.
        int digits = String.valueOf(num).length();
        
        //Remove first digit using modulo.
        int withoutFirst = num % (int) Math.pow(10, digits - 1);

        System.out.println(withoutFirst);
        
    }
}
