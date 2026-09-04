import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(num != 0){
           int digit = num % 10; //get the last digit
            rev = rev * 10 + digit; //build reverse
            num = num / 10; //remove last digit
        }
        
        if (temp == rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }
}
