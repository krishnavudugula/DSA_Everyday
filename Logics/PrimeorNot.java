import java.util.*;
class PrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        
        if(num<=1){
            System.out.println(num + " is Not a Prime Number.");
        } else {
            for (int i =2; i<num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}