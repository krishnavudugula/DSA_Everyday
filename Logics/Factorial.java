import java.util.*;
public class Factorial {

    public static int factorial(int nums){

        int result = 1;

        for(int i=1; i<=nums; i++){
            result *= i;
        }
        return result;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        System.out.println(factorial(nums));
    }
}