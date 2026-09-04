import java.util.*;
public class StrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        
        num = Math.abs(num);

        int strongSum = 0;

        while(num > 0){
            int digit = num % 10; 

            //factorial of digit
            int fact = 1;
            int i = 1;
            while(i<=digit){
                fact *= i;
                i++;
            }
            strongSum += fact;
            num /= 10;
        }
        if(strongSum == original){
            System.out.println("Strong Number " + strongSum);
        }
        else{
            System.out.println("Not a Strong Number " + strongSum);
        }
    }
}
