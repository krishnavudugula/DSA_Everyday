import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        num = Math.abs(num); //or use if(num <= 0)

        int count = String.valueOf(num).length(); //to count digits or else...
        //count digits:
        // int count = 0;
        // int temp = num;
        // while (temp > 0) {
        //     temp /= 10;
        //     count++;
        // }
        if(num == 0){
            count = 1;
        }
        int arm_sum = 0;
        int temp = num;
        while(temp > 0){
            int digit = temp % 10;
            arm_sum = arm_sum + (int) Math.pow(digit, count); //arm_sum = arm_sum + Math.pow(digit, count); doenst work.
            temp /= 10;
        } 
        if (arm_sum == num) {
            System.out.println("Armstrong Numer " + arm_sum);
        }
        else{
            System.out.println("Not an Armstrong Number " + arm_sum);
        }
    }
}